package com.kodilla.good.patterns.challenges.orders.service.repository;

import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;

import java.time.LocalDate;

public interface OrderRepository {

    void createOrder(Integer orderNumber, LocalDate localDate, User user, Product product,
                     Integer numberOfItems, boolean isOrderOk);
}
