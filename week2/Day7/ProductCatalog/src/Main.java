import java.util.ArrayList;
import java.util.List;

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
