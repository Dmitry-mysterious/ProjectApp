package org.skypro.skyshop.product;

public class SimpleProduct extends Product {
    private final int price;

    public SimpleProduct(String productName, int price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Цена не может быть меньше или равняться нулю.");
        }

        super(productName);
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public boolean isSpecial() { return false; }

    @Override
    public String toString() {
        return getName() + ": " + getPrice();
    }
}
