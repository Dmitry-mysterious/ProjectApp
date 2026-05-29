package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.DiscountedProduct;

// test

public class App {
    public static void main(String[] args) {
        SimpleProduct milk = new SimpleProduct("Молоко", 120);
        FixPriceProduct cheese = new FixPriceProduct("Сыр");
        DiscountedProduct bread = new DiscountedProduct("Хлеб", 100, 12);
        SimpleProduct lemon = new SimpleProduct("Лимон", 40);
        DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 100, 20);
        FixPriceProduct juice = new FixPriceProduct("Сок");

        ProductBasket basket = new ProductBasket();
//
        basket.addInBasket(milk);
        basket.addInBasket(cheese);
        basket.addInBasket(bread);
        basket.addInBasket(juice);
        basket.addInBasket(lemon);
        basket.addInBasket(yogurt);

        basket.printInfo();
    }
}
