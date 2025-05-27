import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
        scanner.close();
    }
}
