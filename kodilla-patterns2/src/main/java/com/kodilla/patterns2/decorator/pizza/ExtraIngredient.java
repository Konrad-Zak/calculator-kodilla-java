package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public enum ExtraIngredient {

    HAM(" + Extra Ham", 2),
    CHEESE("  + Extra Cheese", 4),
    ONION(" + Extra Onion", 1),
    DOUBLE_CAKE(" + Extra Double cake",5),
    PEPPER(" + Extra pepper", 3);

    private String name;
    private double price;

    ExtraIngredient(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getCost() {
        return new BigDecimal(price);
    }

    public String getDescription() {
        return name;
    }
}
