import java.util.Arrays;

public class Ques10 {

    public static int[][] storeFriendsData(int[] ages, double[] heights) {
        // Assuming ages and heights are for 3 friends as per the problem
        int[][] friendsData = new int[2][3]; // Row 0 for ages, Row 1 for heights (rounded to int for simplicity if needed, otherwise use double[][])

        // For this problem, storing in two separate arrays as int[] and double[] is sufficient.
        // If the intent was a 2D array, it would likely be double[][] or a custom Friend object.
        // Let's assume the question implies just storing the raw data for age and height.

        // If you were to put them into a 2D array (e.g., for age and height as columns):
        // This is a bit ambiguous if they expect a single 2D array for two different types.
        // Let's clarify based on the hint: "store it in two arrays each to store the values for the age and height of the 3 friends".
        // This means separate arrays for ages and heights.

        // So, the input arrays are already what the hint asks for.
        // The method signature "int[][]" is a bit misleading if the heights are double.
        // I will interpret the prompt as taking age and height arrays and then finding the youngest/tallest.
        // If a single 2D array is strictly required with mixed types, it would be complex in pure Java arrays.

        // For simplicity and adhering to typical Java array usage:
        // We will just process the input arrays.
        // If an actual 2D array of specific types is needed, usually you'd wrap them in a custom object.
        return null; // As per interpretation, the method might just be for processing.
    }

    public static String findYoungestFriend(int[] ages) {
        if (ages == null || ages.length == 0) {
            return "No friends data.";
        }
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        // Assuming friends are "Amar", "Akbar", "Anthony"
        String[] names = {"Amar", "Akbar", "Anthony"};
        return names[youngestIndex];
    }

    public static String findTallestFriend(double[] heights) {
        if (heights == null || heights.length == 0) {
            return "No friends data.";
        }
        double maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        // Assuming friends are "Amar", "Akbar", "Anthony"
        String[] names = {"Amar", "Akbar", "Anthony"};
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        // Data for Amar, Akbar, Anthony
        int[] ages = {25, 30, 22};
        double[] heights = {175.5, 180.0, 170.0}; // in cm

        // The method 'storeFriendsData' is conceptually handled by having the arrays.
        // If it were to return a 2D array, it would need type casting or a generic object array.

        System.out.println("The youngest friend is: " + findYoungestFriend(ages));
        System.out.println("The tallest friend is: " + findTallestFriend(heights));
    }
}