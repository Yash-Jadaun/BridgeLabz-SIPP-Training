import java.util.Scanner;

public class Ques6 {

    public static double calculatePerimeter(double side1, double side2, double side3) {
        return side1 + side2 + side3;
    }

    public static int calculateRoundsFor5Km(double perimeterInMeters) {
        // 5 km = 5000 meters
        if (perimeterInMeters <= 0) {
            return -1; // Indicate error or invalid input
        }
        return (int) Math.ceil(5000.0 / perimeterInMeters);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lengths of the three sides of the triangular park (in meters):");
        System.out.print("Side 1: ");
        double s1 = scanner.nextDouble();
        System.out.print("Side 2: ");
        double s2 = scanner.nextDouble();
        System.out.print("Side 3: ");
        double s3 = scanner.nextDouble();

        double perimeter = calculatePerimeter(s1, s2, s3);
        System.out.println("Perimeter of the park: " + perimeter + " meters");

        int rounds = calculateRoundsFor5Km(perimeter);
        if (rounds != -1) {
            System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
        } else {
            System.out.println("Cannot calculate rounds for the given perimeter.");
        }

        scanner.close();
    }
}