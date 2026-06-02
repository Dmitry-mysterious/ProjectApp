package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        SimpleProduct milk = new SimpleProduct("Молоко", 120);
        FixPriceProduct cheese = new FixPriceProduct("Сыр");
        DiscountedProduct bread = new DiscountedProduct("Хлеб", 100, 12);
        SimpleProduct lemon = new SimpleProduct("Лимон", 40);
        DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 100, 20);
        FixPriceProduct juice = new FixPriceProduct("Сок");

//        ProductBasket basket = new ProductBasket();
//
//        basket.addInBasket(milk);
//        basket.addInBasket(cheese);
//        basket.addInBasket(bread);
//        basket.addInBasket(juice);
//        basket.addInBasket(lemon);
//        basket.addInBasket(yogurt);
//
//        basket.printInfo();

        SearchEngine searchEngine = new SearchEngine(11);
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

        System.out.println("searchEngine.search(\"Молоко\") = " + Arrays.toString(searchEngine.search("Молоко")));
        System.out.println();
        System.out.println("searchEngine.search(\"молоко\") = " + Arrays.toString(searchEngine.search("молоко")));
        System.out.println();
        System.out.println("searchEngine.search(\"Лимон\") = " + Arrays.toString(searchEngine.search("Лимон")));System.out.println();
        System.out.println();
        System.out.println("searchEngine.search(\"Арбуз\") = " + Arrays.toString(searchEngine.search("Арбуз")));
    }
}
