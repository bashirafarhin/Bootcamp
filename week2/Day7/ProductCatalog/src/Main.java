import java.util.ArrayList;
import java.util.List;

// Product Catalog (with Encapsulation & Exceptions)
// Create a Product class with private fields for id, name, and price.
// Throw a custom exception if price is negative.
// Create 3–5 product objects and display their details.

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        try {
            products.add(new Product(1, "Laptop", 55000));
            products.add(new Product(2, "Headphones", 2500));
            products.add(new Product(3, "Keyboard", -500)); // Will throw exception
            products.add(new Product(4, "Mouse", 1200));
            products.add(new Product(5, "Monitor", 11000));

        } catch (InvalidPriceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display all valid products
        System.out.println("\nProduct Catalog:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
