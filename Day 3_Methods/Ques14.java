import java.util.Scanner;

public class Ques14 {

    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4.
        // However, if the year is divisible by 100, it is NOT a leap year,
        // unless it is also divisible by 400.
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close();
    }
}