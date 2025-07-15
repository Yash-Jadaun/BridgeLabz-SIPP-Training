import java.util.Scanner;

class Ques7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();

        try {
            char character = inputString.charAt(index); 
            System.out.println("Character at index " + index + ": " + character);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught.");
        } finally {
            scanner.close();
        }
    }
}