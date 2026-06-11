package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;


public abstract class Product implements Searchable {
    private final String productName;

    public Product(String productName) {
        if (productName == null || productName.isBlank()) {
            throw new IllegalArgumentException("Название продукта не должно быть пустым.");
        }

        this.productName = productName;
    }

    // Getters
    public abstract int getPrice();

    public String getName() {
        return productName;
    }

    public abstract boolean isSpecial();

    @Override
    public String getSearchTerm() {
        return productName;
    }

    @Override
    public String getContentType() {
        return "PRODUCT";
    }

    @Override
    public String getSearchableName() {
        return getName();
    }
}
