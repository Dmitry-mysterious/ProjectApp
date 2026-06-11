package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ProductBasket {
    private List<Product> cart;

    public ProductBasket() {
        this.cart = new LinkedList<>();
    }

    // Метод добавления продукта в корзину --
    public void addInBasket(Product product) {
        cart.add(product);
    }

    // Метод получения общей стоимости корзины
    public int getTotalPrice() {
        int total = 0;

        for (Product product : cart) {
            if (product != null)
                total += product.getPrice();
        }
        return total;
    }

    // Метод, который печатает содержимое корзины
    public void printInfo() {
        boolean hasProduct = false;

        for (Product product : cart) {
            if (product != null) {
                hasProduct = true;

                System.out.println(product);
            }
        }

        if (!hasProduct) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalPrice());
            System.out.println("Специальных товаров: " + countSpecialProduct());
        }
    }

    // Метод, который подсчитывает количество специальных товаров
    public int countSpecialProduct() {
        int specialProduct = 0;

        for (Product product : cart) {
            if (product.isSpecial()) {
                specialProduct++;
            }
        }

        return specialProduct;
    }

    // Метод, проверяющий продукт в корзине по имени
    public boolean findProductByName(String productName) {
        for (Product product : cart) {
            if (product != null && product.getName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    // Метод очистки продуктов из корзины по имени
    public List<Product> deleteProductByName(String name) {
        List<Product> deletedProducts = new LinkedList<>();
        Iterator<Product> iterator = cart.iterator();

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (Objects.equals(product.getName(), name)) {
                deletedProducts.add(product);
                iterator.remove();
            }
        }

        return deletedProducts;
    }


}
