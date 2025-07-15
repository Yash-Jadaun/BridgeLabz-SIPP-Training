import java.util.Scanner;

class Ques12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        String[][] wordData = getWordAndLengthData(inputSentence);

        System.out.println("\nWord Data (Word, Length):");
        for (String[] row : wordData) {
            System.out.println("Word: " + row[0] + ", Length: " + row[1]);
        }

        scanner.close();
    }

    public static String[][] getWordAndLengthData(String str) {
        String[] words = str.split(" ");
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }
}