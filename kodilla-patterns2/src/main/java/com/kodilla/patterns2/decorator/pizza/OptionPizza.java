package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public enum OptionPizza {

    MARGHERITA(true,true,false,false,false, false, 15),
    CAPRICIOSA(true,true,true,true,true, false, 33),
    PARMA(true,true,false,true,false, true, 30);

    private boolean tomatoSauce;
    private boolean cheese;
    private boolean mushrooms;
    private boolean ham;
    private boolean onion;
    private boolean pepper;
    private double price;

    OptionPizza(boolean tomatoSauce, boolean cheese, boolean mushrooms, boolean ham, boolean onion, boolean pepper,
                double price) {
        this.tomatoSauce = tomatoSauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
        this.onion = onion;
        this.pepper = pepper;
        this.price = price;
    }


    public BigDecimal getCost() {
        return new BigDecimal(price);
    }

    public String getDescription() {
        String result = name() + " (";
        if (tomatoSauce) {
            result += " tomatoSauce";
        }
        if (cheese) {
            result += ", cheese";
        }
        if (mushrooms) {
            result += ", mushrooms";
        }
        if (ham) {
            result += ", ham";
        }
        if (onion){
            result += ", onion";
        }
        if (pepper){
            result +=", pepper";
        }
        result += ") ";
        return result;
    }

}
