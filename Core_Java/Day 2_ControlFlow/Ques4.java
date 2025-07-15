import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double num = sc.nextDouble();
            if (num <= 0) break;
            sum += num;
        }

        System.out.println("Total sum is: " + sum);
    }
}
