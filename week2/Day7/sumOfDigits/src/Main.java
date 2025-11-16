import java.util.ArrayList;
import java.util.Scanner;

// Sum of Digits
// Accept a number and find the sum of all its digits. E.g. 1234 → 10 (1+2+3+4)

public class Main {

    public static void sumOfDigits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for sum of digits: ");
        int number = scanner.nextInt();
        int sum=0;
        while(number>10){
            sum+=(number%10);
            number/=10;
        }
        sum+=number;
        System.out.println(sum);
//        scanner.close();
    }

    public static void main(String[] args) {
        sumOfDigits();

    }
}