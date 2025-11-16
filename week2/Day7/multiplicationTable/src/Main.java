import java.util.ArrayList;
import java.util.Scanner;

// Multiplication Table
// Print the multiplication table for any number entered by the user.

public class Main {

    public static void multiplicationTable() {
        System.out.println("Enter number for multiplication table");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Your table");

        for(int i=1;i<=10;i++){
            System.out.println(i*number);
        }
//        scanner.close();
    }

    public static void main(String[] args) {
        multiplicationTable();

    }
}