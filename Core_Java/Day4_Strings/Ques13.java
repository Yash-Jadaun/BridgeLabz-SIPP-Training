import java.util.Scanner;

class Ques13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int[][] counts = getVowelConsonantCountsArray(inputString);
        System.out.println("Vowel Count: " + counts[0][0]);
        System.out.println("Consonant Count: " + counts[0][1]);
        System.out.println("Other Characters: " + counts[0][2]);

        scanner.close();
    }

    public static int[][] getVowelConsonantCountsArray(String str) {
        int[][] counts = new int[1][3]; // [0][0] for vowels, [0][1] for consonants, [0][2] for others
        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    counts[0][0]++;
                } else {
                    counts[0][1]++;
                }
            } else {
                counts[0][2]++;
            }
        }
        return counts;
    }
}