public class Precedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("Result of 10 + 5 * 2 = " + result1);
        int result2 = (10 + 5) * 2;
        System.out.println("Result of (10 + 5) * 2 = " + result2);
        int result3 = 100 / 5 + 10 - 3;
        System.out.println("Result of 100 / 5 + 10 - 3 = " + result3);
        int result4 = 2 + 3 * 4 - 8 / 2;
        System.out.println("Result of 2 + 3 * 4 - 8 / 2 = " + result4);
    }
}
