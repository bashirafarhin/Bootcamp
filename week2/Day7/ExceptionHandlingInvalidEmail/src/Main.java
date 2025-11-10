import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void validateEmail(String email) throws InvalidEmailException {
        if(!email.contains("@")){
            throw new InvalidEmailException("Email Invalid");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        try {
            validateEmail(email);
        }
        catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program completed.");
        scanner.close();
    }
}