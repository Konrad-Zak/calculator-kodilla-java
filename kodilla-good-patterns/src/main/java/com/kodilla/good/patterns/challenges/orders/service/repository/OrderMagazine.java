package com.kodilla.good.patterns.challenges.orders.service.repository;

import com.kodilla.good.patterns.challenges.orders.model.Order;
import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class OrderMagazine implements OrderRepository {

    Map<Integer,Order> orderMap = new HashMap<>();
    Map<Integer,Order> errorOrderMap = new HashMap<>();

    @Override
    public void createOrder(Integer orderNumber, LocalDate localDate, User user,
                            Product product, Integer numberOfItems, boolean isOrderOk) {

        if(isOrderOk){
            orderMap.put(orderNumber,new Order(localDate,user,product,numberOfItems));
        } else {
            errorOrderMap.put(orderNumber,new Order(localDate,user,product,numberOfItems));
        }
        System.out.println("Save in database\n");
    }

}
