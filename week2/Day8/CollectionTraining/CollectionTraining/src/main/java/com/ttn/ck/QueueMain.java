package com.ttn.ck;

import com.ttn.ck.dto.Employee;
import com.ttn.ck.helper.EmployeeHelper;

import java.util.*;

public class QueueMain {
    public static void main(String[] args) {

        // Create and demonstrate PriorityQueue
        Queue<Employee> empPriorityQueue = generatePriorityQueue();
        System.out.println("PriorityQueue (Sorted by Natural Order of Employees):");
        printPriorityQueue(empPriorityQueue);  // Print in priority order

        // Create and demonstrate ArrayDeque (Deque)
        Deque<Employee> empArrayDeque = generateArrayDeque();
        System.out.println("\nArrayDeque (Insertion Order Maintained, Operations at Both Ends):");
        printEmpDeque(empArrayDeque);  // Print the employees from ArrayDeque (order is insertion order)

        // Additional Operations on PriorityQueue
        System.out.println("\nOperations on PriorityQueue:");
        performOperations(empPriorityQueue);

        // Additional Operations on ArrayDeque
        System.out.println("\nOperations on ArrayDeque (Deque):");
        performDequeOperations(empArrayDeque);
    }

    // Method to generate a PriorityQueue of Employees (sorted by natural order of Employee)
    public static Queue<Employee> generatePriorityQueue() {
        Queue<Employee> empQueue = new PriorityQueue<>();
        empQueue.add(EmployeeHelper.getEmp1());
        empQueue.add(EmployeeHelper.getEmp3());
        empQueue.add(EmployeeHelper.getEmp2());
        empQueue.add(EmployeeHelper.getEmp5());
        empQueue.add(EmployeeHelper.getEmp4());
        return empQueue;
    }

    // Method to generate an ArrayDeque of Employees (insertion order maintained)
    public static Deque<Employee> generateArrayDeque() {
        Deque<Employee> empDeque = new ArrayDeque<>();
        empDeque.add(EmployeeHelper.getEmp1());
        empDeque.add(EmployeeHelper.getEmp3());
        empDeque.add(EmployeeHelper.getEmp2());
        empDeque.add(EmployeeHelper.getEmp5());
        empDeque.add(EmployeeHelper.getEmp4());
        return empDeque;
    }

    // Method to print elements of the PriorityQueue (Sorted Order)
    public static void printPriorityQueue(Queue<Employee> empQueue) {
        // Poll the elements in priority order
        while (!empQueue.isEmpty()) {
            Employee emp = empQueue.poll();
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }

    // Method to print elements of the deque (ArrayDeque)
    public static void printEmpDeque(Deque<Employee> empDeque) {
        for (Employee emp : empDeque) {
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }

    // Method to perform operations on a Queue (Offer, Poll, Peek)
    public static void performOperations(Queue<Employee> empQueue) {
        // Check if the queue is empty before peeking
        if (empQueue.isEmpty()) {
            System.out.println("The queue is empty.");
        } else {
            // Peek the head of the queue
            Employee headEmployee = empQueue.peek();
            if (headEmployee != null) {
                System.out.println("Peek (Head of the queue): " + headEmployee.getId());
            } else {
                System.out.println("The queue contains a null element.");
            }
        }

        // Poll the head of the queue and print the removed employee
        System.out.println("\nPolling the head of the queue:");
        Employee polledEmployee = empQueue.poll();
        if (polledEmployee != null) {
            System.out.println("Removed Employee: " + polledEmployee.getId() + " " + polledEmployee.getName() + " " + polledEmployee.getDept());
        } else {
            System.out.println("No employee to remove from the queue.");
        }

        // Offer a new employee to the queue
        System.out.println("\nOffering a new employee to the queue:");
        Employee newEmployee = new Employee(6, "Alice", "HR");
        empQueue.offer(newEmployee);
        printEmpQueue(empQueue);  // Print the queue after offering a new employee
    }

    // Method to perform operations on a Deque (ArrayDeque) - Deque-specific methods
    public static void performDequeOperations(Deque<Employee> empDeque) {
        // Peek the front of the deque
        System.out.println("\nPeek First (Front of the deque): " + empDeque.peekFirst().getId());

        // Peek the rear of the deque
        System.out.println("Peek Last (Rear of the deque): " + empDeque.peekLast().getId());

        // Poll (remove and return the front element of the deque)
        System.out.println("\nPolling the front of the deque:");
        Employee polledEmployeeFront = empDeque.pollFirst();
        System.out.println("Removed from front: " + polledEmployeeFront.getId() + " " + polledEmployeeFront.getName() + " " + polledEmployeeFront.getDept());
        printEmpDeque(empDeque);  // Print the deque after polling the front

        // Poll (remove and return the rear element of the deque)
        System.out.println("\nPolling the rear of the deque:");
        Employee polledEmployeeRear = empDeque.pollLast();
        System.out.println("Removed from rear: " + polledEmployeeRear.getId() + " " + polledEmployeeRear.getName() + " " + polledEmployeeRear.getDept());
        printEmpDeque(empDeque);  // Print the deque after polling the rear

        // Offer (add a new employee to the front of the deque)
        System.out.println("\nOffering a new employee to the front of the deque:");
        Employee newEmployeeFront = new Employee(7, "Bob", "IT");
        empDeque.offerFirst(newEmployeeFront);
        printEmpDeque(empDeque);  // Print the deque after offering a new employee to the front

        // Offer (add a new employee to the rear of the deque)
        System.out.println("\nOffering a new employee to the rear of the deque:");
        Employee newEmployeeRear = new Employee(8, "Charlie", "Finance");
        empDeque.offerLast(newEmployeeRear);
        printEmpDeque(empDeque);  // Print the deque after offering a new employee to the rear
    }

    // Method to print elements of the set
    public static void printEmpQueue(Queue<Employee> empQueue) {
        for (Employee emp : empQueue) {
            System.out.println(emp.getId() + "  " + emp.getName() + "  " + emp.getDept());
        }
    }
}
