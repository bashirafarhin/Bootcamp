import java.util.ArrayList;
import java.util.Scanner;

// Student Report
// Create a Student class with fields for name and marks in 3 subjects.
// Add a method to calculate total and average marks.

public class Main {

    public static void main(String[] args) {

        Student student = new Student("Bashira",1,2,3);
        System.out.println("average marks " + student.total());
        System.out.println("total marks " + student.average());

    }
}