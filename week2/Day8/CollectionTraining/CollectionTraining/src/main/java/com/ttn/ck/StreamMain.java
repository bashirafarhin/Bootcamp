import com.ttn.ck.dto.Employee;

import java.util.*;
import java.util.stream.*;

public class StreamMain {
    public static void main(String[] args) {
        // Example 1: Filter
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter numbers greater than 5
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 5)   // condition
                .collect(Collectors.toList());

        System.out.println("Numbers greater than 5: " + filteredNumbers);

        // Example 2: Group By
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Abhi", "IT"),
                new Employee(2, "Rohan", "HR"),
                new Employee(3, "Mohit", "Finance"),
                new Employee(4, "Rohit", "IT"),
                new Employee(5, "Lalit", "Finance")
        );

        // Group employees by department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));  // Grouping by department

        System.out.println("\nEmployees grouped by department:");
        employeesByDept.forEach((dept, empList) -> {
            System.out.println(dept + ": " + empList);
        });

        // Example 3: Map (Transformation)
        // Sample list of numbers
        List<Integer> numbersForSquare = Arrays.asList(1, 2, 3, 4, 5);

        // Square each number using map
        List<Integer> squaredNumbers = numbersForSquare.stream()
                .map(n -> n * n)  // Squaring each number
                .collect(Collectors.toList());

        System.out.println("\nSquared Numbers: " + squaredNumbers);

        // Example 4: Combine `filter` + `map`
        // Filter employees from 'IT' department and map their names
        List<String> itEmployeeNames = employees.stream()
                .filter(emp -> emp.getDept().equals("IT"))
                .map(Employee::getName)  // Transform to name
                .collect(Collectors.toList());

        System.out.println("\nIT Employees: " + itEmployeeNames);

        // Example 5: Reduce (Sum of all numbers)
        // Sum all the numbers using reduce
        int sum = numbersForSquare.stream()
                .reduce(0, (a, b) -> a + b);  // Initial value 0, then accumulate sum

        System.out.println("\nSum of numbers: " + sum);
    }
}

