package com.kodilla.good.patterns.challenges.orders.model;

public class BuyRequestCreator {

    public BuyRequest createBuyRequest(String firstName, String surname, String nameProduct, Integer numberOfItems){

        return new BuyRequest(new User(firstName,surname),new Product(nameProduct),numberOfItems);
    }
}
