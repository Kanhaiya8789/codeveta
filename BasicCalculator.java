import java.util.Scanner;

public class BasicCalculator {

    // Addition
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division with zero check
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        double result;
        switch (op) {
            case '+':
                result = add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '-':
                result = subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '*':
                result = multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case '/':
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }

        scanner.close();
    }
}