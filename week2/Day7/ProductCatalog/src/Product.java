class InvalidPriceException extends Exception {
    public InvalidPriceException(String message) {
        super(message);
    }
}

// Step 2: Product class with encapsulation
class Product {
    private int id;
    private String name;
    private double price;

    // Constructor
    public Product(int id, String name, double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Price cannot be negative for product: " + name);
        }
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getters (Encapsulation)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Setter with validation (optional)
    public void setPrice(double price) throws InvalidPriceException {
        if (price < 0) {
            throw new InvalidPriceException("Invalid price: " + price);
        }
        this.price = price;
    }

    // toString() for easy display
    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: ₹" + price;
    }
}