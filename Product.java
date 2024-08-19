package gr.aueb.cf.ch19.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Product implements Comparable<Product> {
    private int id;
    private String description;
    private double price;
    private int quantity;

    public Product() {
    }

    public Product(int id, String description, double price, int quantity) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.description.compareTo(o.getDescription());
    }

    // New method to filter products
    public static List<Product> getFilteredProducts(List<Product> products, Predicate<Product> predicate) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (predicate.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }
}
