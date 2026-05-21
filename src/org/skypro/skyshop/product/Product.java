package org.skypro.skyshop.product;

public class Product {
    private String productName;
    private int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    // Getters
    public int getPrice() {
        return price;
    }

    public String getName() {
        return productName;
    }
}
