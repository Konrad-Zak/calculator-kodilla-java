package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pizza extends AbstractPizzaOrderDecorator{

    private OptionPizza optionPizza;

    public Pizza(PizzaOrder pizzaOrder, OptionPizza optionPizza) {
        super(pizzaOrder);
        this.optionPizza = optionPizza;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(optionPizza.getCost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + optionPizza.getDescription();
    }

}
