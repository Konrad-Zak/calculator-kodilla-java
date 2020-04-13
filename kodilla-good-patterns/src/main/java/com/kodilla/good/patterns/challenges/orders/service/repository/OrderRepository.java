package com.kodilla.good.patterns.challenges.orders.service.repository;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder(Integer orderNumber, LocalDate localDate, BuyRequest buyRequest, boolean isOrderOk);
}
