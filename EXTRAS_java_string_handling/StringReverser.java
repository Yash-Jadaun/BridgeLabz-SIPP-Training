package EXTRAS_java_string_handling;

// Problem 2: Reverse a String
import java.util.Scanner;

public class StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String reversedString = "";

        for (int i = originalString.length() - 1; i >= 0; i--) {
            reversedString += originalString.charAt(i);
        }
        System.out.println(reversedString);
        scanner.close();
    }
}