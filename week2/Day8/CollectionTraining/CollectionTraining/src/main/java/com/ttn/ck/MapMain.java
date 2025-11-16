package com.ttn.ck;

import com.ttn.ck.dto.Employee;
import com.ttn.ck.helper.EmployeeHelper;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {

        // Create and demonstrate HashMap
        Map<Integer, Employee> empHashMap = generateHashMap();
        System.out.println("HashMap (No guaranteed order):");
        printMap(empHashMap);  // Print the HashMap

        // Create and demonstrate LinkedHashMap
        Map<Integer, Employee> empLinkedHashMap = generateLinkedHashMap();
        System.out.println("\nLinkedHashMap (Insertion Order Maintained):");
        printMap(empLinkedHashMap);  // Print the LinkedHashMap

        // Create and demonstrate TreeMap
        Map<Integer, Employee> empTreeMap = generateTreeMap();
        System.out.println("\nTreeMap (Sorted by Keys in Natural Order):");
        printMap(empTreeMap);  // Print the TreeMap

        // Additional Operations on HashMap
        System.out.println("\nOperations on HashMap:");
        performMapOperations(empHashMap);

        // Additional Operations on LinkedHashMap
        System.out.println("\nOperations on LinkedHashMap:");
        performMapOperations(empLinkedHashMap);

        // Additional Operations on TreeMap
        System.out.println("\nOperations on TreeMap:");
        performMapOperations(empTreeMap);
    }

    // Method to generate a HashMap of Employees
    public static Map<Integer, Employee> generateHashMap() {
        Map<Integer, Employee> empMap = new HashMap<>();
        empMap.put(1, EmployeeHelper.getEmp1());
        empMap.put(2, EmployeeHelper.getEmp2());
        empMap.put(3, EmployeeHelper.getEmp3());
        empMap.put(4, EmployeeHelper.getEmp4());
        empMap.put(5, EmployeeHelper.getEmp5());
        return empMap;
    }

    // Method to generate a LinkedHashMap of Employees (insertion order)
    public static Map<Integer, Employee> generateLinkedHashMap() {
        Map<Integer, Employee> empMap = new LinkedHashMap<>();
        empMap.put(1, EmployeeHelper.getEmp1());
        empMap.put(2, EmployeeHelper.getEmp2());
        empMap.put(3, EmployeeHelper.getEmp3());
        empMap.put(4, EmployeeHelper.getEmp4());
        empMap.put(5, EmployeeHelper.getEmp5());
        return empMap;
    }

    // Method to generate a TreeMap of Employees (sorted by keys)
    public static Map<Integer, Employee> generateTreeMap() {
        Map<Integer, Employee> empMap = new TreeMap<>();
        empMap.put(2, EmployeeHelper.getEmp2());
        empMap.put(1, EmployeeHelper.getEmp1());
        empMap.put(5, EmployeeHelper.getEmp5());
        empMap.put(3, EmployeeHelper.getEmp3());
        empMap.put(4, EmployeeHelper.getEmp4());
        return empMap;
    }

    // Method to print elements of the map
    public static void printMap(Map<Integer, Employee> empMap) {
        for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Employee: " + entry.getValue().getId() + " " + entry.getValue().getName() + " " + entry.getValue().getDept());
            //System.out.println("Key: " + entry.getKey() + ", Employee: " + entry.getValue());
        }
    }

    // Method to perform various operations on a Map (Put, Get, Remove, ContainsKey)
    public static void performMapOperations(Map<Integer, Employee> empMap) {
        // Retrieve an employee by key
        System.out.println("\nGet employee with key 3: " + empMap.get(3).getName());

        // Remove an employee by key
        System.out.println("\nRemoving employee with key 4:");
        empMap.remove(4);
        printMap(empMap);  // Print the map after removal

        // Check if a key exists in the map
        System.out.println("\nDoes key 2 exist? " + empMap.containsKey(2));

        // Check if a value exists in the map
        System.out.println("\nDoes employee with name 'Alice' exist? " + containsEmployeeByName(empMap, "Alice"));

        // Offer a new employee to the map (using put)
        System.out.println("\nAdding a new employee with key 6:");
        Employee newEmployee = new Employee(6, "David", "Admin");
        empMap.put(6, newEmployee);
        printMap(empMap);  // Print the map after adding the new employee

        // Replace a value for an existing key
        System.out.println("\nReplacing employee with key 6:");
        Employee updatedEmployee = new Employee(6, "Eve", "Marketing");
        empMap.put(6, updatedEmployee);
        printMap(empMap);  // Print the map after replacement

        // Use forEach with lambda expressions to print the map
        System.out.println("\nUsing forEach with lambda expression to print map:");
        empMap.forEach((key, value) -> System.out.println("Key: " + key + ", Employee: " + value.getId() + " " + value.getName()));

        // Check if the map is empty
        System.out.println("\nIs the map empty? " + empMap.isEmpty());

        // Clear the map (remove all entries)
        System.out.println("\nClearing the map...");
        empMap.clear();
        System.out.println("Map after clearing: ");
        printMap(empMap);  // Print the map after clearing

        // Print the size of the map
        System.out.println("\nSize of the map: " + empMap.size());
    }

    // Method to check if an employee with a specific name exists in the map
    public static boolean containsEmployeeByName(Map<Integer, Employee> empMap, String name) {
        for (Employee emp : empMap.values()) {
            if (emp.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
