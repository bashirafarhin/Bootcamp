import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static double division() {
        double result=0;
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter dividend: ");
            int a = scanner.nextInt();
            System.out.println("Enter divisor: ");
            int b = scanner.nextInt();
            result = (double)a/b;
        } catch(ArithmeticException e) {
            System.out.println("Error occured"+e);
        } finally {
            System.out.println("Division completed");
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(division());
    }
}