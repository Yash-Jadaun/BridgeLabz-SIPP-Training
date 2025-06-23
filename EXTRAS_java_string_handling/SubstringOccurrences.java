package EXTRAS_java_string_handling;

// Problem 6: Find Substring Occurrences
import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mainString = scanner.nextLine();
        String subString = scanner.nextLine();
        int count = 0;
        int lastIndex = 0;

        while ((lastIndex = mainString.indexOf(subString, lastIndex)) != -1) {
            count++;
            lastIndex += subString.length();
        }
        System.out.println(count);
        scanner.close();
    }
}