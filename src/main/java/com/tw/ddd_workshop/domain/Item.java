package com.tw.ddd_workshop.domain;

public class Item {
    private Product product;
    private int quantity;

    public Item(Product product) {
        this(product, 1);
    }

    public Item(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
