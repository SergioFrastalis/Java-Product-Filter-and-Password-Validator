package gr.aueb.cf.ch19.homework;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product(1, "Milk", 2.25, 100),
                new Product(2, "Honey", 8.50, 50),
                new Product(3, "Oranges", 3.15, 200),
                new Product(4, "Apples", 5.90, 20)
        ));

        // Sorting by description (ascending)
        Collections.sort(products);
        System.out.println("Sorted by description (ascending):");
        products.forEach(System.out::println);

        // Filtering products by price greater than 5.00
        List<Product> expensiveProducts = Product.getFilteredProducts(products, p -> p.getPrice() > 5.00);
        System.out.println("Products with price greater than 5.00:");
        expensiveProducts.forEach(System.out::println);

        // Filtering products by quantity less than 100
        List<Product> lowStockProducts = Product.getFilteredProducts(products, p -> p.getQuantity() < 100);
        System.out.println("Products with quantity less than 100:");
        lowStockProducts.forEach(System.out::println);
    }
}
