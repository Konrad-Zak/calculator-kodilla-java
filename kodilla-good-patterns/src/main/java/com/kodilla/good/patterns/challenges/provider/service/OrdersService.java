package com.kodilla.good.patterns.challenges.provider.service;


import com.kodilla.good.patterns.challenges.provider.model.Order;
import com.kodilla.good.patterns.challenges.provider.model.shop.MapShop;
import com.kodilla.good.patterns.challenges.provider.model.shop.Shop;

import java.util.Map;

public class OrdersService {

    private MapShop mapShop;

    public OrdersService(MapShop mapShop) {
        this.mapShop = mapShop;
    }

    public void showProvider(){
        mapShop.showMap();
    }

    public void submitOrder(Order order){
        Map<String,Shop> shopMap = mapShop.getShopMap();
        Shop shop = shopMap.get(order.getShopName());
        boolean isOrdered = shop.process(order.getProduct());
        System.out.println("\n" + order + " status " + isOrdered);
    }

}
