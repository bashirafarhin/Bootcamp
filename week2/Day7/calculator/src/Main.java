import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("calculator add: "+ calculator.add(1,2));
        System.out.println("calculator substract: "+ calculator.substract(1,2));
        System.out.println("calculator multiply: "+ calculator.multiply(1,2));
        System.out.println("calculator divide: "+ calculator.divide(5,2));

    }
}