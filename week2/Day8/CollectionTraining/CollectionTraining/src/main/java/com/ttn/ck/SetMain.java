package com.ttn.ck;

import com.ttn.ck.dto.Employee;
import com.ttn.ck.helper.EmployeeHelper;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {
    public static void main(String[] args) {

        // Create and demonstrate HashSet
        Set<Employee> empHashSet = generateHashSet();
        System.out.println("HashSet (No Specific Order):");
        printEmpSet(empHashSet);  // Prints the employees from HashSet (order is not guaranteed)
        checkPerformance(empHashSet, "HashSet");

        // Create and demonstrate LinkedHashSet
        Set<Employee> empLinkedHashSet = generateLinkedHashSet();
        System.out.println("\nLinkedHashSet (Insertion Order Maintained):");
        printEmpSet(empLinkedHashSet);  // Prints the employees from LinkedHashSet (order is insertion order)
        checkPerformance(empLinkedHashSet, "LinkedHashSet");

        // Create and demonstrate TreeSet
        Set<Employee> empTreeSet = generateTreeSet();
        System.out.println("\nTreeSet (Sorted Order):");
        printEmpSet(empTreeSet);  // Prints the employees from TreeSet (sorted by natural order)
        checkPerformance(empTreeSet, "TreeSet");

        // Perform operations on a smaller data set (using only 3 employees for operations)
        System.out.println("\nOperations on HashSet (Smaller Data Set):");
        performOperations(empHashSet);

        System.out.println("\nOperations on LinkedHashSet (Smaller Data Set):");
        performOperations(empLinkedHashSet);

        System.out.println("\nOperations on TreeSet (Smaller Data Set):");
        performOperations(empTreeSet);
    }

    // Method to generate a HashSet of Employees (smaller data set)
    public static Set<Employee> generateHashSet() {
        Set<Employee> empSet = new HashSet<>();
        empSet.add(EmployeeHelper.getEmp1());
        empSet.add(EmployeeHelper.getEmp2());
        empSet.add(EmployeeHelper.getEmp3());
        empSet.add(EmployeeHelper.getEmp4());
        empSet.add(EmployeeHelper.getEmp5());
        return empSet;
    }

    // Method to generate a LinkedHashSet of Employees (smaller data set)
    public static Set<Employee> generateLinkedHashSet() {
        Set<Employee> empSet = new LinkedHashSet<>();
        empSet.add(EmployeeHelper.getEmp1());
        empSet.add(EmployeeHelper.getEmp2());
        empSet.add(EmployeeHelper.getEmp3());
        empSet.add(EmployeeHelper.getEmp4());
        empSet.add(EmployeeHelper.getEmp5());
        return empSet;
    }

    // Method to generate a TreeSet of Employees (sorted by natural order of Employee)
    public static Set<Employee> generateTreeSet() {
        Set<Employee> empSet = new TreeSet<>();
        empSet.add(EmployeeHelper.getEmp1());
        empSet.add(EmployeeHelper.getEmp2());
        empSet.add(EmployeeHelper.getEmp3());
        empSet.add(EmployeeHelper.getEmp4());
        empSet.add(EmployeeHelper.getEmp5());
        return empSet;
    }

    // Method to print elements of the set
    public static void printEmpSet(Set<Employee> empSet) {
        for (Employee emp : empSet) {
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }

    // Method to perform operations on a Set (Add, Remove, Contains) on a smaller data set
    public static void performOperations(Set<Employee> empSet) {
        // Create a smaller set to perform operations
        Set<Employee> smallerSet = new HashSet<>();
        smallerSet.add(EmployeeHelper.getEmp1());
        smallerSet.add(EmployeeHelper.getEmp2());
        smallerSet.add(EmployeeHelper.getEmp3());

        System.out.println("\nOperations on smaller data set:");

        // Add a new employee to the smaller set
        System.out.println("Adding a new employee:");
        Employee newEmployee = new Employee(6, "Alice", "HR");
        smallerSet.add(newEmployee);
        printEmpSet(smallerSet);

        // Remove an employee from the smaller set
        System.out.println("\nRemoving employee with ID 2:");
        smallerSet.remove(EmployeeHelper.getEmp2());  // Remove employee with ID 2
        printEmpSet(smallerSet);

        // Check if an employee is present in the smaller set
        System.out.println("\nDoes the smaller set contain Employee with ID 3?");
        boolean containsEmployee = smallerSet.contains(EmployeeHelper.getEmp3());
        System.out.println("Contains: " + containsEmployee);

        // Operations specific to each Set type
        if (empSet instanceof HashSet) {
            System.out.println("\nOperations specific to HashSet:");
            // HashSet specific: Add and remove operations are fast but unordered.
            // Trying to add a duplicate employee (same ID, should not be allowed in a HashSet)
            Employee duplicateEmployee = new Employee(6, "Alice", "HR");
            boolean isAdded = empSet.add(duplicateEmployee);  // This will return false as duplicates are not allowed
            System.out.println("HashSet allows duplicate elements: " + isAdded);
        }


        if (empSet instanceof LinkedHashSet) {
            System.out.println("\nOperations specific to LinkedHashSet:");
            // LinkedHashSet specific: Maintains insertion order.
            LinkedHashSet<Employee> linkedHashSet = (LinkedHashSet<Employee>) empSet;
            System.out.println("First element in LinkedHashSet (insertion order): " + linkedHashSet.iterator().next());
        }
        if (empSet instanceof TreeSet) {
            System.out.println("\nOperations specific to TreeSet:");
            // TreeSet specific: NavigableSet operations
            TreeSet<Employee> treeSet = (TreeSet<Employee>) empSet;
            System.out.println("First element in TreeSet (sorted order): " + treeSet.first());
            System.out.println("Last element in TreeSet (sorted order): " + treeSet.last());
            System.out.println("Lower than employee ID 4: " + treeSet.lower(new Employee(4, "Employee4", "Dept4")));
            System.out.println("Higher than employee ID 3: " + treeSet.higher(new Employee(3, "Employee3", "Dept3")));
        }
    }

    // Method to measure performance of adding an element to the set (Time taken)
    public static void checkPerformance(Set<Employee> empSet, String setType) {
        long startTime = System.nanoTime();

        // Simulating adding a large number of employees to the set (1000 employees)
        for (int i = 0; i < 1000; i++) {
            empSet.add(new Employee(i, "Employee " + i, "Dept " + i));
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("\nTime taken to add 1000 employees to " + setType + ": " + duration + " nanoseconds");
    }
}
