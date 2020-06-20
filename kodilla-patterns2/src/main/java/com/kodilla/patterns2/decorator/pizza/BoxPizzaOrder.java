package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BoxPizzaOrder implements PizzaOrder {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(2);
    }

    @Override
    public String getDescription() {
        return "Box + " ;
    }

}
