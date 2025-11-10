public class Customer {
    private int id;
    private String name;
    private String email;

    Customer(int id, String name, String email) {
        this.id=id;
        this.name=name;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email;
    }

}