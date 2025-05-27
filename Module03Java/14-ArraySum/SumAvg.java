import java.util.Scanner;

public class SumAvg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double average = (double) sum / n;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        scanner.close();
    }
}
