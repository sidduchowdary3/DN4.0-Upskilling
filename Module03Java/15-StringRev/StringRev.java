import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String rev = new StringBuilder(str).reverse().toString(); }
        System.out.println("Reversed string: " + rev);
        scanner.close();
    }
}
