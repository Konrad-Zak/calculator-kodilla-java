package com.kodilla.good.patterns.challenges.orders.service;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;
import com.kodilla.good.patterns.challenges.orders.model.OrderDto;
import com.kodilla.good.patterns.challenges.orders.service.buying.BuyingService;
import com.kodilla.good.patterns.challenges.orders.service.information.InformationService;
import com.kodilla.good.patterns.challenges.orders.service.repository.OrderRepository;

import java.time.LocalDate;

public class ProductOrderService {

    private InformationService informationService;
    private BuyingService buyingService;
    private OrderRepository orderRepository;
    private int count = 0;

    public ProductOrderService ( InformationService informationService,  BuyingService buyingService,
                                 OrderRepository orderRepository) {
        this.informationService = informationService;
        this.buyingService = buyingService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(BuyRequest buyRequest) {
        LocalDate localDate = LocalDate.now();
        Integer numberOrder = setNumberOrder();
        boolean isCorrectBuyOrder = buyingService.buy(buyRequest);

        orderRepository.createOrder(numberOrder,localDate,buyRequest, isCorrectBuyOrder);

        if (isCorrectBuyOrder){
            informationService.inform(numberOrder,localDate,buyRequest);
            return new OrderDto(numberOrder, buyRequest.getUser(), true);
        } else {
            return new OrderDto(numberOrder, buyRequest.getUser(),false);
        }

    }

    private Integer setNumberOrder(){
        count++;
        return 1000*count + 100*count + count;
    }
}
