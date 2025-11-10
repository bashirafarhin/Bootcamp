import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void reverseNumber() {
        System.out.println("Enter number to reverse the number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse=0;
        while(number>0){
            reverse=reverse*10+number %10;
            number/=10;
        }
        System.out.println(reverse);
        scanner.close();
    }

    public static void main(String[] args) {
        reverseNumber();
    }
}