import java.util.Scanner;

public class Ques13 {

    // Recursive method to find the sum of n natural numbers
    public static long sumNaturalNumbersRecursive(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sumNaturalNumbersRecursive(n - 1);
        }
    }


    public static long sumNaturalNumbersFormula(int n) {
        if (n <= 0) {
            return 0;
        }
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        long sumRecursive = sumNaturalNumbersRecursive(n);
        long sumFormula = sumNaturalNumbersFormula(n);

        System.out.println("Sum using recursive method for n=" + n + ": " + sumRecursive);
        System.out.println("Sum using formula n(n+1)/2 for n=" + n + ": " + sumFormula);

        if (sumRecursive == sumFormula) {
            System.out.println("The results from both computations are correct and match.");
        } else {
            System.out.println("There is a mismatch in the results.");
        }

        scanner.close();
    }
}