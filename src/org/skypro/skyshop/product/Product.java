package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;


public abstract class Product implements Searchable {
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
