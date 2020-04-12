package com.kodilla.good.patterns.challenges.orders.service.buying;

import com.kodilla.good.patterns.challenges.orders.model.BuyRequest;
import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.shop.Magazine;

import java.util.Map;

public class BuyProcessor implements BuyingService {

    private Map<Product, Integer> magazineProduct;

    public BuyProcessor() {
        Magazine magazine = new Magazine();
        magazineProduct = magazine.getMagazineProduct();
    }

    @Override
    public Boolean buy(BuyRequest buyRequest) {
        Integer numberItemsInMagazine = magazineProduct.get(buyRequest.getProduct());
        boolean result = numberItemsInMagazine - buyRequest.getNumberOfItems() >= 0;

        if(result){
            System.out.println("\nAssent order buy");
        } else {
            System.out.println("\nNot enough items on magazine");
        }
        return result;
    }
}
