package com.kodilla.good.patterns.challenges.orders.service.information;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;

import java.time.LocalDate;

public interface InformationService {

    void inform(Integer orderNumber, LocalDate localDate, BuyRequest buyRequest);
}
