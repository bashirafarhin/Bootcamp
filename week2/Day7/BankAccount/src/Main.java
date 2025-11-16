import java.util.ArrayList;
import java.util.Scanner;

// Bank Account Class
// Create a BankAccount class with accountNumber, holderName, and balance.
// Add a constructor to initialize these fields.

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(2103,"BOI", 100);
        bankAccount.displayAccountDetails();

    }
}