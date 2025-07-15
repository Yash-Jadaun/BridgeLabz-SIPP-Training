package EXTRAS_java_string_handling;

// Problem 9: Find the Most Frequent Character
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        Map<Character, Integer> charCounts = new HashMap<>();

        for (char ch : inputString.toCharArray()) {
            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
        }

        char mostFrequent = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        scanner.close();
    }
}