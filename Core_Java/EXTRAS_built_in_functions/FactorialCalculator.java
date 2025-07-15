package EXTRAS_built_in_functions;


import java.util.Scanner;

public class FactorialCalculator {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        System.out.println(factorial(num));

        scanner.close();
    }
}