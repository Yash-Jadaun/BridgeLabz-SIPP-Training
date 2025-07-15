package EXTRAS_java_string_handling;

import java.util.Scanner;

public class WordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String oldWord = scanner.next();
        String newWord = scanner.next();

        String modifiedSentence = sentence.replace(oldWord, newWord);
        System.out.println(modifiedSentence);
        scanner.close();
    }
}