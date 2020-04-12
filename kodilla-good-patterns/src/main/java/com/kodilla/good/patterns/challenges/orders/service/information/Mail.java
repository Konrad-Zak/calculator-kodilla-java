package com.kodilla.good.patterns.challenges.orders.service.information;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;

import java.time.LocalDate;

public class Mail implements InformationService {
    @Override
    public void inform(Integer orderNumber, LocalDate localDate, BuyRequest buyRequest) {
        System.out.println("Your order: "+  orderNumber + " date: "+ localDate + " " + buyRequest);
        System.out.println( "Send information to client \n");
    }
}
