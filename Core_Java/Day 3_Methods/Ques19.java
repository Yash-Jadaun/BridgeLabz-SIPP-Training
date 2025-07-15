import java.util.Arrays;

public class Ques19 {

    public static int countDigit(int number) {
        if (number == 0) {
            return 1;
        }
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] storeDigitsInArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int[] reverseDigitsArray(int[] digits) {
        if (digits == null || digits.length == 0) {
            return new int[]{};
        }
        int[] reversedDigits = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversedDigits[i] = digits[digits.length - 1 - i];
        }
        return reversedDigits;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindromeNumber(int number) {
        int[] originalDigits = storeDigitsInArray(number);
        int[] reversedDigits = reverseDigitsArray(originalDigits);
        return areArraysEqual(originalDigits, reversedDigits);
    }

    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        int[] digits = storeDigitsInArray(number);
        System.out.println("Original Digits array: " + Arrays.toString(digits));
        int[] reversedDigits = reverseDigitsArray(digits);
        System.out.println("Reversed Digits array: " + Arrays.toString(reversedDigits));
        System.out.println("Are original and reversed arrays equal? " + areArraysEqual(digits, reversedDigits));
        System.out.println("Is Palindrome Number? " + isPalindromeNumber(number));

        System.out.println("\nChecking a non-palindrome number (e.g., 12345):");
        number = 12345;
        System.out.println("Number: " + number);
        System.out.println("Is Palindrome Number? " + isPalindromeNumber(number));

        System.out.println("\nChecking a duck number (e.g., 102):");
        number = 102;
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        System.out.println("\nChecking a non-duck number (e.g., 123):");
        number = 123;
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}