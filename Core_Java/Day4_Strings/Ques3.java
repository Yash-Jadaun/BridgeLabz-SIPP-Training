import java.util.Scanner;

class Ques3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter end index: ");
        int endIndex = scanner.nextInt();

        try {
            if (startIndex < 0 || endIndex > inputString.length() || startIndex > endIndex) {
                throw new IllegalArgumentException("Invalid start or end indices for substring.");
            }
            String sub = inputString.substring(startIndex, endIndex);
            System.out.println("Substring: " + sub);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}