import java.util.ArrayList;
import java.util.Scanner;

// Exception Propagation (Method Chain)
// Write three methods (m1(), m2(), m3()):
// m1() calls m2(), and m2() calls m3().
// m3() divides by zero.
//  Observe how the exception propagates up the chain and catch it in m1().
// Re-throw Exception
//  Catch an exception inside a try-catch block, print a message,
//  then re-throw it to be handled by another catch block at a higher level.

public class Main {

    public static int m3() {
        return 1/0;
    }

    public static int m2() {
        return m3();
    }

    public static int m1() {
        int result=0;
        try {
            result = m2();

        } catch(Exception e) {
            System.out.println("Error caught in m1");
        }
        return result;
    }

    public static void main(String[] args) {
        m1();
    }
}