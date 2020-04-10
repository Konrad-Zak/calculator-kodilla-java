package com.kodilla.good.patterns.challenges.orders.service.buying;

import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;
import com.kodilla.good.patterns.challenges.orders.shop.Magazine;

import java.util.Map;

public class Buy implements BuyingService {

    Magazine magazine = new Magazine();
    Map<Product, Integer> magazineProduct;

    public Buy() {
        magazineProduct = magazine.getMagazineProduct();
    }

    @Override
    public Boolean buy(User user, Product product, Integer numberOfItems) {
        Integer numberItemsInMagazine = magazineProduct.get(product);
        boolean result = numberItemsInMagazine - numberOfItems > 0;

        if(result){
            System.out.println("Assent order buy");
        } else {
            System.out.println("Not enough items on magazine");
        }
        return result;
    }
}
