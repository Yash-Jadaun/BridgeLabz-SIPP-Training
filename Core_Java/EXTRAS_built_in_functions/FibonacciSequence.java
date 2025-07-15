package EXTRAS_built_in_functions;


import java.util.Scanner;

public class FibonacciSequence {

    public static void generateFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();
        generateFibonacci(count);

        scanner.close();
    }
}