package EXTRAS_java_string_handling;

// Problem 8: Compare Two Strings (Lexicographical)
import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int minLength = Math.min(str1.length(), str2.length());
        int comparison = 0;

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                comparison = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }

        if (comparison == 0) {
            comparison = str1.length() - str2.length();
        }

        if (comparison < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (comparison > 0) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            System.out.println("Both strings are lexicographically equal");
        }
        scanner.close();
    }
}