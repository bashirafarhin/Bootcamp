class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) throws InvalidAmountException {
        if (initialBalance < 0) {
            throw new InvalidAmountException("Initial balance cannot be negative.");
        }
        this.balance = initialBalance;
    }

    // deposit method
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    // withdraw method
    public void withdraw(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InvalidAmountException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrew: ₹" + amount);
    }

    // getBalance method
    public double getBalance() {
        return balance;
    }
}
