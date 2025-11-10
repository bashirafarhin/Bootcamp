import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void printFactorial() {
        System.out.println("Enter number for factorial");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int fact = 1;
        for(; number>1;number--){
            fact*=number;
        }
        System.out.println(fact);
        scanner.close();
    }

    public static void main(String[] args) {
        printFactorial();
    }
}