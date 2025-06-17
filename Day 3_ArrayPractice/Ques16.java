import java.util.Arrays;

public class Ques16 {

    // 1. Method to find the count of digits in the number
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        return String.valueOf(Math.abs(number)).length();
    }

    // 2. Method to store the digits of the number in a digits array
    public static int[] storeDigitsInArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    // 3. Method to check if a number is a duck number
    // A duck number is a positive integer that contains zero in it.
    // Leading zeros are not considered.
    public static boolean isDuckNumber(int number) {
        String numStr = String.valueOf(number);
        // Check from the second character to avoid leading zeros if input is like 0123
        // For practical purposes, input will likely not have leading zeros unless it's a string
        // Assuming integer input, a leading zero is not possible for a number unless it's 0 itself.
        // A number like 102 is a duck number. 012 is not 012, it's 12.
        for (int i = 0; i < numStr.length(); i++) {
            if (numStr.charAt(i) == '0') {
                return true;
            }
        }
        return false;
    }

    // 4. Method to check if a number is an Armstrong number
    // An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
    // E.g., 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = countDigits(number);
        long sumOfPowers = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfPowers += Math.pow(digit, numDigits);
            tempNumber /= 10;
        }
        return sumOfPowers == originalNumber;
    }

    // 5. Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargestInDigitsArray(int[] digits) {
        if (digits == null || digits.length < 2) {
            // Not enough elements to find largest and second largest
            return new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE}; // Or throw an exception
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // 6. Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallestInDigitsArray(int[] digits) {
        if (digits == null || digits.length < 2) {
            // Not enough elements to find smallest and second smallest
            return new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE}; // Or throw an exception
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }


    public static void main(String[] args) {
        int number = 153;
        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        int[] digits = storeDigitsInArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));

        int[] largeSmall = findLargestAndSecondLargestInDigitsArray(digits);
        System.out.println("Largest digit: " + largeSmall[0] + ", Second largest digit: " + largeSmall[1]);

        int[] smallLarge = findSmallestAndSecondSmallestInDigitsArray(digits);
        System.out.println("Smallest digit: " + smallLarge[0] + ", Second smallest digit: " + smallLarge[1]);

        System.out.println("\nTesting with another number (e.g., 102):");
        number = 102;
        System.out.println("Number: " + number);
        System.out.println("Is Duck Number? " + isDuckNumber(number));

        System.out.println("\nTesting with a non-Armstrong number (e.g., 123):");
        number = 123;
        System.out.println("Number: " + number);
        System.out.println("Is Armstrong Number? " + isArmstrongNumber(number));
    }
}