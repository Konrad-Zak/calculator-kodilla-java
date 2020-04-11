package com.kodilla.good.patterns.challenges.provider.model.shop;

import java.util.HashMap;
import java.util.Map;

public class MapShop {

    private Map<String, Shop> shopMap = new HashMap<>();

    public MapShop() {
        shopMap.put("ExtraFoodShop",new ExtraFoodShop());
        shopMap.put("HealthyShop",new HealthyShop());
        shopMap.put("GlutenFreeShop",new GlutenFreeShop());
    }

    public void showMap(){
        shopMap.forEach((key, value) -> System.out.println(key + " - " + value));
    }

    public Map<String,Shop> getShopMap(){
        return new HashMap<>(shopMap);
    }

}
