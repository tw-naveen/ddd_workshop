package com.tw.ddd_workshop.application;

import com.tw.ddd_workshop.domain.Cart;
import com.tw.ddd_workshop.domain.Item;
import com.tw.ddd_workshop.domain.Product;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Item ipad = new Item(new Product("iPad Pro"));
        cart.add(ipad);

        Item heroInkPen = new Item(new Product("Hero ink Pen"));
        cart.add(heroInkPen);

        Item gmCricketBat = new Item(new Product("GM Cricket Bat"), 2);
        cart.add(gmCricketBat);

        cart.remove(ipad);
    }
}
