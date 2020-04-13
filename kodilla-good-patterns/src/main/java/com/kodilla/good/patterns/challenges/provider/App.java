package com.kodilla.good.patterns.challenges.provider;

import com.kodilla.good.patterns.challenges.provider.model.Order;
import com.kodilla.good.patterns.challenges.provider.model.shop.MapShop;
import com.kodilla.good.patterns.challenges.provider.model.OrderCreator;
import com.kodilla.good.patterns.challenges.provider.service.OrdersService;

public class App {
    public static void main(String[] args) {


        OrderCreator orderCreator = new OrderCreator();
        Order order1 = orderCreator.createOrder("ExtraFoodShop","Tomato",20);
        Order order2 = orderCreator.createOrder("HealthyShop","Pear",13);
        Order order3 = orderCreator.createOrder("GlutenFreeShop","Banana",500);

        OrdersService ordersService = new OrdersService(new MapShop());
        ordersService.showProvider();
        ordersService.submitOrder(order1);
        ordersService.submitOrder(order2);
        ordersService.submitOrder(order3);
    }
}
