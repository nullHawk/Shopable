package com.nullhawk.shopable.services;

import com.nullhawk.shopable.models.Cart;

import java.util.List;

public interface CartServ {

    List<Cart> getAll();

    Cart getCart(long id);

    List<Cart> inDateRange(String start, String end);

    List<Cart> userCart(long userId);

    void addNewCart(Cart cart);

    void updateProduct(Cart cart);

    void deleteCart(long id);


}

