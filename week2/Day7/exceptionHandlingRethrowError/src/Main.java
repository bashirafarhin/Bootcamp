import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static int m3() {
        return 1/0;
    }

    public static int m2() {
        int result=0;
        try {
            result = m3();

        } catch(Exception e) {
            System.out.println("Error caught in m2");
            throw e;
        }
        return result;
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