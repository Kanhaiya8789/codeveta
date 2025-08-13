import java.util.Scanner;

public class MultipleFactorials {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n < 0) {
            return -1; // Negative number, invalid
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers do you want to calculate factorial for? ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = scanner.nextInt();

            long result = factorial(num);

            if (result == -1) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + num + " is: " + result);
            }
        }
    }
}
