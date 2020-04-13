package com.kodilla.good.patterns.challenges.provider.model.shop;

import com.kodilla.good.patterns.challenges.provider.model.Product;
import java.util.*;

public class ExtraFoodShop implements Shop {

    private Map<String,Integer> productMap = new HashMap<>();

    public ExtraFoodShop() {
        productMap.put("Tomato",20);
        productMap.put("Onion",40);
        productMap.put("Orange",10);
    }


    @Override
    public Boolean process(Product product) {

        if(!productMap.containsKey(product.getNameProduct())){
            System.out.println("Product not exist");
            return false;
        }

        int difference = productMap.get(product.getNameProduct()) - product.getNumberOfItems();

        if(difference>=0){
            productMap.replace(product.getNameProduct(),difference);
            return true;
        }

        System.out.println("Insufficient number of products");
        return false;

    }


    @Override
    public String toString() {
        return " product: " + productMap;
    }
}
