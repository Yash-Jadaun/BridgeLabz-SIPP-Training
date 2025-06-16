import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for the countdown: ");
        int count = input.nextInt();

        while (count >= 1) {
            System.out.println(count);
            count--;
        }
        System.out.println("Rocket launch!");

        input.close();
    }
}