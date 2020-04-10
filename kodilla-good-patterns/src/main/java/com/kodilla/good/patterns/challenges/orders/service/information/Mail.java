package com.kodilla.good.patterns.challenges.orders.service.information;

import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;

import java.time.LocalDate;

public class Mail implements InformationService {
    @Override
    public void inform(Integer orderNumber, LocalDate localDate , User user, Product product, Integer numberOfItems) {
        System.out.println("Your order: "+  orderNumber + " date: "+ localDate + " user: " + user.getFirstName() + " "
                + user.getSurname() + " Product: " + product.getProductName() + " number of item: " + numberOfItems );
        System.out.println( "Send information to client ");
    }
}
