package org.skypro.skyshop.basket;
import org.skypro.skyshop.product.Product;

public class ProductBasket {
    private Product[] cart;

    public ProductBasket() {
        this.cart = new Product[5];
    }

    // Метод добавления продукта в корзину
    public void addInBasket(Product product) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
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
                System.out.println(product.getName() + ": " + product.getPrice());
                hasProduct = true;
            }
        }

        if (!hasProduct) {
            System.out.println("В корзине пусто");
        } else {
            System.out.println("Итого: " + getTotalPrice());
        }
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

    // Метод очистки корзины
    public void clearBasket() {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                cart[i] = null;
            }
        }
    }


}
