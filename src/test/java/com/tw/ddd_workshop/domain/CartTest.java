package com.tw.ddd_workshop.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class CartTest {

    @Test
    void shouldAddAnItemToCart() {
        Product product = new Product("iPad Pro");
        Item item = new Item(product);
        Cart cart = new Cart();

        Assertions.assertTrue(cart.add(item));
    }

    @Test
    void shouldRemoveAnItemFromCart() {
        Product product = new Product("iPad Pro");
        Item item = new Item(product);
        Cart cart = new Cart();

        cart.add(item);

        Assertions.assertTrue(cart.remove(item));
    }

    @Test
    void shouldAddMultipleItemToCart() {
        Product product = new Product("iPad Pro");
        Item ipadItem = new Item(product);

        Product pen = new Product("Pen");
        Item penItem = new Item(pen);

        Cart cart = new Cart();
        cart.add(ipadItem);
        cart.add(penItem);

        Assertions.assertEquals(2, cart.itemsCount());
    }

    @Test
    void shouldNotRemoveAnItemNotInTheCart() {
        Product ipad = new Product("iPad Pro");
        Item item1 = new Item(ipad);

        Product pen = new Product("Pen");
        Item item2 = new Item(pen);
        Cart cart = new Cart();

        cart.add(item1);

        Assertions.assertFalse(cart.remove(item2));
    }

    @Test
    void shouldGetListOfRemovedItems() {
        Product ipad = new Product("iPad Pro");
        Item ipadItem = new Item(ipad);

        Product pen = new Product("Pen");
        Item penItem = new Item(pen);
        Cart cart = new Cart();

        cart.add(ipadItem);
        cart.add(penItem);
        cart.remove(ipadItem);

        List<Item> expectedRemovedItems = new ArrayList<>();
        expectedRemovedItems.add(ipadItem);

        Assertions.assertEquals(expectedRemovedItems, cart.getRemovedItems());
    }
}