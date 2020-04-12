package com.kodilla.good.patterns.challenges.orders.service.repository;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderMagazine implements OrderRepository {

    private Map<Integer,BuyRequest> orderMap = new HashMap<>();
    private Map<Integer,BuyRequest> errorOrderMap = new HashMap<>();

    @Override
    public void createOrder(Integer orderNumber, LocalDate localDate, BuyRequest buyRequest, boolean isOrderOk) {

        if(isOrderOk){
            orderMap.put(orderNumber,buyRequest);
        } else {
            errorOrderMap.put(orderNumber,buyRequest);
        }
        System.out.println(localDate + " Save in database");
    }

}
