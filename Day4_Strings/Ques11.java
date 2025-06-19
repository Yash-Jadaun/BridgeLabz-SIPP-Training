import java.util.Scanner;

class Ques11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            int age;
            boolean validInput = false;
            while (!validInput) {
                System.out.print("Enter age for student " + (i + 1) + ": ");
                age = scanner.nextInt();
                if (age < 0) {
                    System.out.println("Invalid age: Age cannot be negative. Please re-enter.");
                } else if (age > 100) {
                    System.out.println("Invalid age: Age cannot be greater than 100. Please re-enter.");
                } else {
                    ages[i] = age;
                    validInput = true;
                }
            }
        }

        System.out.println("\nVoting Eligibility:");
        for (int i = 0; i < 10; i++) {
            if (ages[i] >= 18) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is not eligible to vote.");
            }
        }

        scanner.close();
    }
}