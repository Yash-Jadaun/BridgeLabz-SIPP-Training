import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter age and height for Amar:");
        System.out.print("Age: ");
        int amarAge = input.nextInt();
        System.out.print("Height (cm): ");
        double amarHeight = input.nextDouble();

        System.out.println("Enter age and height for Akbar:");
        System.out.print("Age: ");
        int akbarAge = input.nextInt();
        System.out.print("Height (cm): ");
        double akbarHeight = input.nextDouble();

        System.out.println("Enter age and height for Anthony:");
        System.out.print("Age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Height (cm): ");
        double anthonyHeight = input.nextDouble();

        // Find the smallest age
        int smallestAge = amarAge;
        if (akbarAge < smallestAge) {
            smallestAge = akbarAge;
        }
        if (anthonyAge < smallestAge) {
            smallestAge = anthonyAge;
        }
        System.out.println("The smallest age among the three is: " + smallestAge);

        // Find the tallest height
        double tallestHeight = amarHeight;
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
        }
        System.out.println("The tallest height among the three is: " + tallestHeight + " cm");

        input.close();
    }
}