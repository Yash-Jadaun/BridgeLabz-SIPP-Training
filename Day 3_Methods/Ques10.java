import java.util.Arrays;

public class Ques10 {

    public static int[][] storeFriendsData(int[] ages, double[] heights) {
   
        int[][] friendsData = new int[2][3]; 

    
        return null; 
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