class Employee {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Method to be overridden
    public double calculateSalary() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}