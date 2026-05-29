package org.skypro.skyshop.product;

public abstract class Product {
    private final String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    // Getters
    public abstract int getPrice();

    public String getName() {
        return productName;
    }

    public abstract boolean isSpecial();
}
