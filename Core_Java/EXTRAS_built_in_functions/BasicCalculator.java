package EXTRAS_built_in_functions;


import java.util.Scanner;

public class BasicCalculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation (+, -, *, /):");
        char operation = scanner.next().charAt(0);

        double result;
        switch (operation) {
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
                System.out.println("Invalid operation");
        }

        scanner.close();
    }
}