package com.ttn.ck;

import com.ttn.ck.dto.Employee;
import com.ttn.ck.helper.EmployeeHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListMain {
    public static void main(String args[]) {

        // Generate and print ArrayList
        List<Employee> empArrayList = generateArrayList();
        System.out.println("ArrayList:");
        printEmpListUsingForLoop(empArrayList);  // Using for loop to print ArrayList elements
        // Demonstrating other ArrayList methods
        System.out.println("\nArrayList Methods:");
        System.out.println("Size: " + empArrayList.size());  // ArrayList size
        System.out.println("Element at index 2: " + empArrayList.get(2).getName());  // Get element by index
        System.out.println("Contains Employee with id 3: " + empArrayList.contains(EmployeeHelper.getEmp3())); // contains method
        System.out.println("Index of Employee with id 4: " + empArrayList.indexOf(EmployeeHelper.getEmp4())); // indexOf method
        System.out.println("Is ArrayList empty? " + empArrayList.isEmpty());  // isEmpty method

        // Adding all elements from another list
        List<Employee> anotherList = generateArrayList();
        empArrayList.addAll(anotherList); // addAll method
        System.out.println("After adding all employees from another list, size: " + empArrayList.size());

        // Generate and print LinkedList
        List<Employee> empLinkedList = generateLinkedList();
        System.out.println("\nLinkedList:");
        printEmpListUsingIterator(empLinkedList);  // Using iterator to print LinkedList elements
        // Demonstrating other LinkedList methods
        System.out.println("\nLinkedList Methods:");
        if (empLinkedList instanceof LinkedList) {
            LinkedList<Employee> linkedList = (LinkedList<Employee>) empLinkedList;
            System.out.println("First Element: " + linkedList.getFirst().getName());  // First element in LinkedList
            System.out.println("Last Element: " + linkedList.getLast().getName());    // Last element in LinkedList
        }

        // Remove element from LinkedList by index and by object
        empLinkedList.remove(2); // Removes element at index 2
        empLinkedList.remove(EmployeeHelper.getEmp5()); // Removes employee by object
        System.out.println("After removal, size of LinkedList: " + empLinkedList.size());

        // Set method
        empLinkedList.set(0, EmployeeHelper.getEmp4()); // Replace first element
        System.out.println("First Element after set: " + empLinkedList.get(0).getName());
    }

    // Method to generate an ArrayList of Employees
    public static List<Employee> generateArrayList() {
        List<Employee> empList = new ArrayList<>();
        empList.add(EmployeeHelper.getEmp1());
        empList.add(EmployeeHelper.getEmp5());
        empList.add(EmployeeHelper.getEmp2());
        empList.add(EmployeeHelper.getEmp4());
        empList.add(EmployeeHelper.getEmp3());


        return empList;
    }

    // Method to generate a LinkedList of Employees
    public static List<Employee> generateLinkedList() {
        List<Employee> empList = new LinkedList<>();
        empList.add(EmployeeHelper.getEmp1());
        empList.add(EmployeeHelper.getEmp5());
        empList.add(EmployeeHelper.getEmp2());
        empList.add(EmployeeHelper.getEmp4());
        empList.add(EmployeeHelper.getEmp3());
        return empList;
    }

    // Method to print the list using a for loop
    public static void printEmpListUsingForLoop(List<Employee> empList) {
        for (Employee emp : empList) {
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }

    // Method to print the list using an iterator
    public static void printEmpListUsingIterator(List<Employee> empList) {
        Iterator<Employee> employeeIterator = empList.iterator();
        while (employeeIterator.hasNext()) {
            Employee emp = employeeIterator.next();
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }
}
