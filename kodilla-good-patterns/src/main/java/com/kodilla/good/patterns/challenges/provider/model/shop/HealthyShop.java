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
        boolean result = false;
        if(productMap.containsKey(product.getNameProduct())){
            int difference = productMap.get(product.getNameProduct()) - product.getNumberOfItems();
            if(difference>4 && difference % 2 == 0){
                productMap.replace(product.getNameProduct(),difference);
                result = true;
            } else {
                System.out.println("Too low stock or odd order");
            }
        } else {
            System.out.println("Product not exist");
        }
        return result;
    }

    @Override
    public String toString() {
        return " product: " + productMap;
    }
}
