package com.kodilla.good.patterns.challenges.orders.shop;

import com.kodilla.good.patterns.challenges.orders.model.Product;

import java.util.HashMap;
import java.util.Map;

public class Magazine {

    private Map<Product, Integer> magazineProduct = new HashMap<>();

    public Magazine() {
        magazineProduct.put(new Product("Book"),24);
        magazineProduct.put(new Product("Game"),20);
        magazineProduct.put(new Product("Umbrella"),4);
        magazineProduct.put(new Product("Console"),2);
        magazineProduct.put(new Product("Phone"),1);
    }

    public Map<Product,Integer> getMagazineProduct(){
        return new HashMap<>(magazineProduct);
    }
}

