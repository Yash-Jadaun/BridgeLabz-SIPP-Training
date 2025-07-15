import java.util.ArrayList;
import java.util.List;

public class Ques18 {

    public static boolean isPerfectNum(int number) {
        if (number <= 1) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += (number / i);
                }
            }
        }
        return sumOfDivisors == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += (number / i);
                }
            }
        }
        return sumOfDivisors > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 1) {
            return false;
        }
        int sumOfDivisors = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
                if (i * i != number) {
                    sumOfDivisors += (number / i);
                }
            }
        }
        return sumOfDivisors < number;
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrongNumber(int number) {
        if (number < 0) return false;
        int originalNumber = number;
        long sumOfFactorialDigits = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfFactorialDigits += factorial(digit);
            tempNumber /= 10;
        }
        return sumOfFactorialDigits == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Checking number 6:");
        System.out.println("Is Perfect Number? " + isPerfectNumber(6));
        System.out.println("Is Abundant Number? " + isAbundantNumber(6));
        System.out.println("Is Deficient Number? " + isDeficientNumber(6));
        System.out.println("Is Strong Number? " + isStrongNumber(6));

        System.out.println("\nChecking number 12:");
        System.out.println("Is Perfect Number? " + isPerfectNumber(12));
        System.out.println("Is Abundant Number? " + isAbundantNumber(12));
        System.out.println("Is Deficient Number? " + isDeficientNumber(12));
        System.out.println("Is Strong Number? " + isStrongNumber(12));

        System.out.println("\nChecking number 10:");
        System.out.println("Is Perfect Number? " + isPerfectNumber(10));
        System.out.println("Is Abundant Number? " + isAbundantNumber(10));
        System.out.println("Is Deficient Number? " + isDeficientNumber(10));
        System.out.println("Is Strong Number? " + isStrongNumber(10));

        System.out.println("\nChecking number 145:");
        System.out.println("Is Perfect Number? " + isPerfectNumber(145));
        System.out.println("Is Abundant Number? " + isAbundantNumber(145));
        System.out.println("Is Deficient Number? " + isDeficientNumber(145));
        System.out.println("Is Strong Number? " + isStrongNumber(145));
    }
}