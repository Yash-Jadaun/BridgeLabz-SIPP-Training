package EXTRAS_built_in_functions;


// Problem 7: GCD and LCM Calculator
import java.util.Scanner;

public class GcdLcmCalculator {

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("GCD: " + findGCD(num1, num2));
        System.out.println("LCM: " + findLCM(num1, num2));

        scanner.close();
    }
}