package DataStructure.LinearandBinarySearch.LinearSearch;

public class SearchWord {
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) return sentence;
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"I love Java", "Hello world", "Welcome"};
        System.out.println(findSentence(sentences, "Java")); // Output: I love Java
    }
}
