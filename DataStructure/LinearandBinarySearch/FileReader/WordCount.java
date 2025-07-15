package DataStructure.LinearandBinarySearch.FileReader;

import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        int count = 0;
        String wordToFind = "Java";

        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                for (String word : line.split("\\s+")) {
                    if (word.equals(wordToFind)) count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Occurrences: " + count);
    }
}

