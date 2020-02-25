package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final BigDecimal quantityOfPeople;

    public Country(final BigDecimal quantityOfPeople) {
        this.quantityOfPeople = quantityOfPeople;
    }

    public BigDecimal getPeopleQuantity(){
        return quantityOfPeople;
    }
}
