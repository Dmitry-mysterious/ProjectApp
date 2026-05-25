package org.skypro.skyshop.product;

public class DiscountedProduct extends Product{
    private final int basedPrice;
    private final int discount;

    public DiscountedProduct(String productName, int basedPrice, int discount) {
        super(productName);
        this.basedPrice = basedPrice;
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public int getPrice() {
        return basedPrice * (100 - discount) / 100;
    }

    @Override
    public boolean isSpecial() { return true; }

    @Override
    public String toString() {
        return getName() + ": " + getPrice() + "(" + getDiscount() + "%)";
    }
}
