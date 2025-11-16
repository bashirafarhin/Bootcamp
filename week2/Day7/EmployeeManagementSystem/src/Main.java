import java.util.ArrayList;
import java.util.List;

// Employee Management System
// Create an Employee class (POJO).
// Extend it with FullTimeEmployee and PartTimeEmployee subclasses.
// Override a method to calculate salary differently for each.
// Use polymorphism to call methods on a list of employees.

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runned");
    }
}


public class Main {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new Runnable () {
            @Override
            public void run() {
                System.out.println("MyRunnable runned");
            }
        }).start();
    }
}