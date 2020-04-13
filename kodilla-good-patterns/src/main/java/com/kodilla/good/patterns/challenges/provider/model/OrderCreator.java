package com.kodilla.good.patterns.challenges.provider.model;

public class OrderCreator {

    public Order createOrder(String shopName, String productName, Integer quantity){
        return new Order(shopName,new Product(productName,quantity));
    }
}
