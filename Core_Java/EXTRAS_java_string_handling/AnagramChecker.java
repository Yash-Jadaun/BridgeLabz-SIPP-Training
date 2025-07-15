package EXTRAS_java_string_handling;

// Problem 11: Check if Two Strings are Anagrams
import java.util.Scanner;
import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine().toLowerCase();
        String str2 = scanner.nextLine().toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Are Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
        scanner.close();
    }
}