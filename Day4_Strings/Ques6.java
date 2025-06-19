import java.util.Scanner;

class Ques6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string that represents a number: ");
        String inputString = scanner.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format.");
        } finally {
            scanner.close();
        }
    }
}