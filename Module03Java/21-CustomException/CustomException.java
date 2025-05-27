import java.util.Scanner;
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access denied. Age must be 18 or above.");
        } else {
            System.out.println("Access granted. You are eligible.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
