import java.util.Scanner;

class Ques14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String shortestWord = getShortestWord(inputSentence);
        String longestWord = getLongestWord(inputSentence);

        System.out.println("Shortest word: " + shortestWord);
        System.out.println("Longest word: " + longestWord);

        scanner.close();
    }

    public static String getShortestWord(String str) {
        String[] words = str.split(" ");
        if (words.length == 0) {
            return "";
        }
        String shortest = words[0];
        for (String word : words) {
            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }
        return shortest;
    }

    public static String getLongestWord(String str) {
        String[] words = str.split(" ");
        if (words.length == 0) {
            return "";
        }
        String longest = words[0];
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}