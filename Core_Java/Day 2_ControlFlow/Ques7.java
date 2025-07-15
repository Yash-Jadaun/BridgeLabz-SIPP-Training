import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
            long sumFormulae = (long) n * (n + 1) / 2;
            System.out.println("Sum using formula (n*(n+1)/2): " + sumFormulae);

            long sumWhileLoop = 0;
            int i = 1;
            while (i <= n) {
                sumWhileLoop += i;
                i++;
            }
            System.out.println("Sum using while loop: " + sumWhileLoop);

            if (sumFormulae == sumWhileLoop) {
                System.out.println("Both computations are correct. The results match.");
            } else {
                System.out.println("There is a mismatch between the formula and while loop computations.");
            }
        }

        input.close();
    }
}