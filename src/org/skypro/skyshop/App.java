package org.skypro.skyshop;

import org.skypro.skyshop.article.Article;
import org.skypro.skyshop.exceptions.BestResultNotFound;
import org.skypro.skyshop.product.SimpleProduct;
import org.skypro.skyshop.product.FixPriceProduct;
import org.skypro.skyshop.product.DiscountedProduct;
import org.skypro.skyshop.search.SearchEngine;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

//        try {
//            SimpleProduct milk = new SimpleProduct("  ", 120);
//            FixPriceProduct cheese = new FixPriceProduct("Сыр");
//            DiscountedProduct bread = new DiscountedProduct("Хлеб", -7, 12);
//            SimpleProduct lemon = new SimpleProduct("Лимон", 40);
//            DiscountedProduct yogurt = new DiscountedProduct("Йогурт", 100, 2000);
//            FixPriceProduct juice = new FixPriceProduct("Сок");
//        } catch (IllegalArgumentException e) {
//            e.printStackTrace();
//        }


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
