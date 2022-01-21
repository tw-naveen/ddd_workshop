package com.tw.ddd_workshop.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;
    private List<Item> removedItems;

    public Cart() {
        this.items = new ArrayList<>();
        this.removedItems = new ArrayList<>();
    }

    public boolean add(Item item) {
        return items.add(item);
    }

    /*private Item getItem(Item newItem) {
        Item item = items.stream().filter(existingItem
                -> existingItem.getProduct().getName().equalsIgnoreCase(newItem.getProduct().getName())).findAny().orElse(null);
    }*/

    public boolean remove(Item item) {
        if (items.contains(item)) {
            removedItems.add(item);
            return items.remove(item);
        }
        return false;
    }

    public List<Item> getRemovedItems() {
        return new ArrayList<>(removedItems);
    }

    public int itemsCount() {
        return items.size();
    }

}
