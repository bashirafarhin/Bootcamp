import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Step 2: Create Customer objects
        Customer c1 = new Customer(101, "Aisha", "aisha@gmail.com");
        Customer c2 = new Customer(102, "Ravi", "ravi@gmail.com");
        Customer c3 = new Customer(103, "Noor", "noor@gmail.com");

        // Step 3: Add them to a List
        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);

        // Step 4: Print all customer details
        System.out.println("Customer Details:");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
}