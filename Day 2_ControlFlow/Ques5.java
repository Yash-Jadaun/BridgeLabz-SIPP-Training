import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println(n + " is not a natural number.");
        } else {
            int sum = n * (n + 1) / 2;
            System.out.println("Sum of first " + n + " natural numbers is " + sum);
        }
    }
}
