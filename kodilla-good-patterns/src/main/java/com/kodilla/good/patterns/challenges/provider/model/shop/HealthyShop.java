package com.kodilla.good.patterns.challenges.provider.model.shop;

import com.kodilla.good.patterns.challenges.provider.model.Product;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements Shop {

    private Map<String,Integer> productMap = new HashMap<>();

    public HealthyShop() {
        productMap.put("Apple",12);
        productMap.put("Potato",22);
        productMap.put("Pear",34);
    }


    @Override
    public Boolean process(Product product) {
        if (!productMap.containsKey(product.getNameProduct())) {
            System.out.println("HealthyShop: Product doesn't exist");
            return false;
        }

        int difference = productMap.get(product.getNameProduct()) - product.getNumberOfItems();
        if (difference <= 4 || difference % 2 == 1) {
            System.out.println("\n HealthyShop: Too low stock or odd order");
            return false;
        }

        productMap.replace(product.getNameProduct(), difference);
        return true;
    }

    @Override
    public String toString() {
        return " product: " + productMap;
    }
}
