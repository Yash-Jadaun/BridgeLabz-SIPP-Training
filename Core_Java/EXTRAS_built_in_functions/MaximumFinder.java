package EXTRAS_built_in_functions;

// Problem 2: Maximum Finder
import java.util.Scanner;

public class MaximumFinder {

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = findMaximum(num1, num2, num3);
        System.out.println(max);

        scanner.close();
    }
}