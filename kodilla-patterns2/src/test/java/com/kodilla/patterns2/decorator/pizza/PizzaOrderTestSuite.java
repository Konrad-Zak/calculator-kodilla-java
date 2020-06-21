package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import java.math.BigDecimal;
import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaGetCost(){
        //Given
        PizzaOrder pizzaOrder = new BoxPizzaOrder();
        pizzaOrder = new Pizza(pizzaOrder, OptionPizza.CAPRICIOSA);
        pizzaOrder = new Pizza(pizzaOrder, OptionPizza.MARGHERITA);
        pizzaOrder = new Ingredient(pizzaOrder,ExtraIngredient.CHEESE);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(54),theCost);
    }

    @Test
    public void testPizzaGetDescription(){
        //Given
        String expect = "Box + PARMA ( tomatoSauce, cheese, ham, pepper)" +
                "  + Extra Double cake + Extra Ham + Extra Onion + Extra pepper";
        PizzaOrder pizzaOrder = new BoxPizzaOrder();
        pizzaOrder = new Pizza(pizzaOrder,OptionPizza.PARMA);
        pizzaOrder = new Ingredient(pizzaOrder,ExtraIngredient.DOUBLE_CAKE);
        pizzaOrder = new Ingredient(pizzaOrder, ExtraIngredient.HAM);
        pizzaOrder = new Ingredient(pizzaOrder, ExtraIngredient.ONION);
        pizzaOrder = new Ingredient(pizzaOrder,ExtraIngredient.PEPPER);
        //When
        String order = pizzaOrder.getDescription();
        //Then
        assertEquals(expect,order);
    }

}
