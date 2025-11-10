import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void nestedTryCatchBlock() {
        try {

            try {
                int res = 1/0;
            } catch(ArithmeticException e) {
                System.out.println("Nested Error occured"+e);
            }
            int[] arr=new int[1];
            int value = arr[2];

        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Error occured"+e);
        }
    }

    public static void main(String[] args) {
        nestedTryCatchBlock();
    }
}