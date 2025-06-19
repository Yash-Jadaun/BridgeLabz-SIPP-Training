import java.util.Arrays;
import java.util.Scanner;

class Ques10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[] builtInWords = inputSentence.split(" ");
        String[] customWords = splitStringCustom(inputSentence, ' ');
        int[] wordLengths = getWordLengths(customWords);
        int[] spaceIndices = getSpaceIndices(inputSentence);

        System.out.println("Built-in split words: " + Arrays.toString(builtInWords));
        System.out.println("Custom split words: " + Arrays.toString(customWords));
        System.out.println("Word lengths: " + Arrays.toString(wordLengths));
        System.out.println("Space indices: " + Arrays.toString(spaceIndices));

        scanner.close();
    }

    public static String[] splitStringCustom(String str, char delimiter) {
        // Count delimiters to determine array size
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == delimiter) {
                count++;
            }
        }
        String[] result = new String[count + 1];
        int startIndex = 0;
        int wordIndex = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == delimiter) {
                result[wordIndex++] = str.substring(startIndex, i);
                startIndex = i + 1;
            }
        }
        result[wordIndex] = str.substring(startIndex); // Add the last word
        return result;
    }

    public static int[] getWordLengths(String[] words) {
        int[] lengths = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            lengths[i] = words[i].length();
        }
        return lengths;
    }

    public static int[] getSpaceIndices(String str) {
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        int[] indices = new int[spaceCount];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                indices[index++] = i;
            }
        }
        return indices;
    }
}