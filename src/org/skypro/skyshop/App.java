package org.skypro.skyshop;
import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 120);
        Product cheese = new Product("Сыр", 150);
        Product bread = new Product("Хлеб", 50);
        Product lemon = new Product("Лимон", 40);
        Product yogurt = new Product("Йогурт", 100);
        Product juice = new Product("Сок", 110);

        ProductBasket basket = new ProductBasket();
        ProductBasket basket2 = new ProductBasket();
//
        basket.addInBasket(milk);
        basket.addInBasket(cheese);
        basket.addInBasket(bread);
        basket.addInBasket(juice);
        basket.addInBasket(lemon);
        basket.addInBasket(yogurt);

        basket.printInfo();

        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        boolean hasMilk = basket.findProductByName("Молоко");

        System.out.println("hasMilk = " + hasMilk);

        boolean hasCucumber = basket.findProductByName("Огурец");

        System.out.println("hasCucumber = " + hasCucumber);

        basket.clearBasket();

        basket.printInfo();

        System.out.println("basket.getTotalPrice() = " + basket.getTotalPrice());

        hasMilk = basket.findProductByName("Молоко");

        System.out.println("hasMilk = " + hasMilk);

        System.out.println();
        System.out.println("================Те же продукты, но другая корзина и порядок их добавления=================");
        System.out.println();

        basket2.addInBasket(milk);
        basket2.addInBasket(yogurt);
        basket2.addInBasket(cheese);
        basket2.addInBasket(bread);
        basket2.addInBasket(juice);
        basket2.addInBasket(lemon);

        basket2.printInfo();

        System.out.println("Общая стоимость: " + basket2.getTotalPrice());

        boolean hasBread = basket2.findProductByName("Хлеб");

        System.out.println("hasBread = " + hasBread);

        boolean hasLemon = basket2.findProductByName("Лимон");

        System.out.println("hasLemon = " + hasLemon);

        basket2.clearBasket();

        basket2.printInfo();

        System.out.println("basket.getTotalPrice() = " + basket2.getTotalPrice());

        hasBread = basket2.findProductByName("Хлеб");

        System.out.println("hasBread = " + hasBread);
    }
}
