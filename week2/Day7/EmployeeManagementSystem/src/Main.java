import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create employee objects
        employees.add(new FullTimeEmployee(1, "Aisha", 50000));
        employees.add(new FullTimeEmployee(2, "Ravi", 60000));
        employees.add(new PartTimeEmployee(3, "Noor", 80, 500));
        employees.add(new PartTimeEmployee(4, "Bashira", 100, 400));

        // Polymorphism in action
        System.out.println("Employee Salary Details:\n");
        for (Employee emp : employees) {
            System.out.println(emp + ", Salary: ₹" + emp.calculateSalary());
        }
    }
}