public class Main {


// Mini Banking Application
// Create a BankAccount class with deposit(), withdraw(), and getBalance() methods.
// Add exception handling for invalid amounts and overdrafts.
// Keep track of total accounts using a static variable.

    public static void main(String[] args) {
        try {
            BankAccount account = new BankAccount(2000);  // initial balance ₹1000

            account.deposit(100);
            account.withdraw(600);
            account.withdraw(3000); // will throw error

            System.out.println("Final Balance: ₹" + account.getBalance());

        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}