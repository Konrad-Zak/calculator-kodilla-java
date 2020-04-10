package com.kodilla.good.patterns.challenges.orders.service.information;

import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;

import java.time.LocalDate;

public interface InformationService {

    void inform(Integer orderNumber, LocalDate localDate, User user, Product product, Integer NumberOfItems);
}
