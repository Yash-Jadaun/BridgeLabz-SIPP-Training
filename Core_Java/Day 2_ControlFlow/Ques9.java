import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            long sumFormulae = (long) n * (n + 1) / 2;
            System.out.println("Sum using formula (n*(n+1)/2): " + sumFormulae);

            long sumForLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumForLoop += i;
            }
            System.out.println("Sum using for loop: " + sumForLoop);

            if (sumFormulae == sumForLoop) {
                System.out.println("Both computations are correct. The results match.");
            } else {
                System.out.println("There is a mismatch between the formula and for loop computations.");
            }
        }

        input.close();
    }
}