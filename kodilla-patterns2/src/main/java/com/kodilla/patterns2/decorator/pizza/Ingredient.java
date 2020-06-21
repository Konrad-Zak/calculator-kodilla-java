package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class Ingredient extends AbstractPizzaOrderDecorator {

    private ExtraIngredient extraIngredient;

    public Ingredient(PizzaOrder pizzaOrder, ExtraIngredient extraIngredient) {
        super(pizzaOrder);
        this.extraIngredient = extraIngredient;
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(extraIngredient.getCost());
    }

    @Override
    public String getDescription() {
        return super.getDescription() + extraIngredient.getDescription();
    }
}
