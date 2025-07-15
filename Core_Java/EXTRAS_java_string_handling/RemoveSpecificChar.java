package EXTRAS_java_string_handling;

import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        char charToRemove = scanner.next().charAt(0);
        StringBuilder modifiedString = new StringBuilder();

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.charAt(i) != charToRemove) {
                modifiedString.append(originalString.charAt(i));
            }
        }
        System.out.println("Modified String: \"" + modifiedString.toString() + "\"");
        scanner.close();
    }
}