package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.List;

public class App {
    public static void main(String[] args) {

        SimpleProduct milk = new SimpleProduct("Молоко", 120);
        FixPriceProduct cheese = new FixPriceProduct("Сыр");
        DiscountedProduct bread = new DiscountedProduct("Хлеб", 100, 12);
        SimpleProduct lemon = new SimpleProduct("Лимон", 40);
        DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 100, 20);
        FixPriceProduct juice = new FixPriceProduct("Сок");

        SearchEngine searchEngine = new SearchEngine();
        Article milkArticle = new Article("Молоко", "Деревенское коровье молоко");
        Article bradArticle = new Article("Хлеб", "Домашний хлеб из печи");
        Article lemonArticle = new Article("Лимон", "Большой желтый импортный лимон");
        Article juiceArticle = new Article("Сок", "Сок из натуральных яблок");

        searchEngine.add(milk);
        searchEngine.add(cheese);
        searchEngine.add(bread);
        searchEngine.add(lemon);
        searchEngine.add(yogurt);
        searchEngine.add(juice);
        searchEngine.add(milk);
        searchEngine.add(lemon);

        searchEngine.add(milkArticle);
        searchEngine.add(bradArticle);
        searchEngine.add(lemonArticle);
        searchEngine.add(juiceArticle);

        System.out.println("searchEngine.search(\"Молоко\") = " + searchEngine.search("Молоко"));
        System.out.println();
        System.out.println("searchEngine.search(\"молоко\") = " + searchEngine.search("молоко"));
        System.out.println();
        System.out.println("searchEngine.search(\"Лимон\") = " + searchEngine.search("Лимон"));
        System.out.println();
        System.out.println("searchEngine.search(\"Арбуз\") = " + searchEngine.search("Арбуз"));

        System.out.println();


        System.out.println("-----Демонтрация метода удаления по имени-----");
        ProductBasket productBasket = new ProductBasket();

        productBasket.addInBasket(milk);
        productBasket.addInBasket(cheese);
        productBasket.addInBasket(lemon);
        productBasket.addInBasket(bread);

        productBasket.printInfo();
        System.out.println();

        System.out.println("productBasket.deleteProductsByName(\"Молоко\") = " + productBasket.deleteProductByName("Молоко"));
        System.out.println("productBasket.deleteProductsByName(\"Сыр\") = " + productBasket.deleteProductByName("Сыр"));

        productBasket.printInfo();
        System.out.println();

        List<Product> delProduct = productBasket.deleteProductByName("Помидор");

        if (delProduct.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Удалены: " + delProduct);


        SearchEngine searchEngine = new SearchEngine(10);

        try {
            SimpleProduct milk = new SimpleProduct("Молоко", 120);
            FixPriceProduct cheese = new FixPriceProduct("Сыр");
            DiscountedProduct bread = new DiscountedProduct("Хлеб", 70, 12);
            SimpleProduct lemon = new SimpleProduct("Лимон", 40);
            DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 100, 15);
            FixPriceProduct juice = new FixPriceProduct("Сок");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }


        Article milkArticle = new Article("Коровье молоко", "молоко собственного производства из коров выращенных на ферме");

        searchEngine.add(milkArticle);


        try {
            System.out.println("searchEngine.findMostRelevant(\"молоко\") = " + searchEngine.findMostRelevant("молоко"));
        } catch (BestResultNotFound e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println("searchEngine.findMostRelevant(\"сыр\") = " + searchEngine.findMostRelevant("сыр"));
        } catch (BestResultNotFound e) {
            throw new RuntimeException(e);

        }

    }
}
