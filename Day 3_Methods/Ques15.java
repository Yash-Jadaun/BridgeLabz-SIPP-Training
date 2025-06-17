import java.util.Random;
import java.util.Arrays;

public class Ques15 {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomNumbers(int size) {
        int[] randomNumbers = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            // Generate a number between 1000 (inclusive) and 9999 (inclusive)
            randomNumbers[i] = random.nextInt(9000) + 1000;
        }
        return randomNumbers;
    }

    // Method to find the average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return new double[]{0.0, 0.0, 0.0}; // Return zeros for empty array
        }

        long sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int arraySize = 5; // As per the problem, generates five 4-digit random numbers
        int[] randomNums = generate4DigitRandomNumbers(arraySize);

        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNums));

        double[] stats = findAverageMinMax(randomNums);
        System.out.println("Average: " + stats[0]);
        System.out.println("Minimum: " + (int) stats[1]); // Cast to int for displaying min/max
        System.out.println("Maximum: " + (int) stats[2]); // Cast to int for displaying min/max
    }
}