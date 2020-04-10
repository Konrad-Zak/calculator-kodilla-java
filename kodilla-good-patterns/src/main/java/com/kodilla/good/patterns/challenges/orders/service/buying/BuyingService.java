package com.kodilla.good.patterns.challenges.orders.service.buying;

import com.kodilla.good.patterns.challenges.orders.model.Product;
import com.kodilla.good.patterns.challenges.orders.model.User;

public interface BuyingService {

    Boolean buy(User user, Product product, Integer numberOfItems);

}
