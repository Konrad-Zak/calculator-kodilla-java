package com.kodilla.good.patterns.challenges.provider.model.shop;

import com.kodilla.good.patterns.challenges.provider.model.Product;


import java.util.HashMap;
import java.util.Map;

public class GlutenFreeShop implements Shop {


    private Map<String,Integer> productMap = new HashMap<>();

    public GlutenFreeShop() {
        productMap.put("Banana",10000);
        productMap.put("Plum",7000);
        productMap.put("Raspberry",4000);
    }


    @Override
    public Boolean process(Product product) {
        if(productMap.containsKey(product.getNameProduct())){
            int difference = productMap.get(product.getNameProduct()) - product.getNumberOfItems();
            productMap.replace(product.getNameProduct(),difference);
            return true;
        } else {
            System.out.println("Product not exist");
            return false;
        }
    }

    @Override
    public String toString() {
        return " product: " + productMap;
    }
}
