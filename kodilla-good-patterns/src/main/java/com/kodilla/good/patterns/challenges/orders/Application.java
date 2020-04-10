package com.kodilla.good.patterns.challenges.orders;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;
import com.kodilla.good.patterns.challenges.orders.model.BuyRequestCreator;
import com.kodilla.good.patterns.challenges.orders.model.OrderDto;
import com.kodilla.good.patterns.challenges.orders.service.ProductOrderService;
import com.kodilla.good.patterns.challenges.orders.service.buying.Buy;
import com.kodilla.good.patterns.challenges.orders.service.information.Mail;
import com.kodilla.good.patterns.challenges.orders.service.print.Print;
import com.kodilla.good.patterns.challenges.orders.service.repository.OrderMagazine;

public class Application {
    public static void main(String[] args) {

        BuyRequestCreator buyRequestCreator = new BuyRequestCreator();

        BuyRequest buyRequest1 = buyRequestCreator.createBuyRequest("Adam","Nos",
                "Book",3);
        BuyRequest buyRequest2 = buyRequestCreator.createBuyRequest("Max","Kol",
                "Console" ,2);
        BuyRequest buyRequest3 = buyRequestCreator.createBuyRequest("Don","Ala",
                "Phone",2);
        BuyRequest buyRequest4 = buyRequestCreator.createBuyRequest("Mas","Los",
                "Game",18);

        ProductOrderService productOrderService = new ProductOrderService(new Mail(),new Buy(),new OrderMagazine());
        OrderDto orderDto1 = productOrderService.process(buyRequest1);
        OrderDto orderDto2 = productOrderService.process(buyRequest2);
        OrderDto orderDto3 = productOrderService.process(buyRequest3);
        OrderDto orderDto4 = productOrderService.process(buyRequest4);

        Print printer = new Print();
        printer.print(orderDto1);
        printer.print(orderDto2);
        printer.print(orderDto3);
        printer.print(orderDto4);

    }
}
