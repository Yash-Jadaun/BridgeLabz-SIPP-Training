import java.util.Arrays;
import java.util.Scanner;

class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        char[] builtInCharArray = inputString.toCharArray();
        char[] customCharArray = toCharArrayCustom(inputString);

        System.out.println("Built-in char array: " + Arrays.toString(builtInCharArray));
        System.out.println("Custom char array: " + Arrays.toString(customCharArray));
        System.out.println("Arrays match: " + Arrays.equals(builtInCharArray, customCharArray));

        scanner.close();
    }

    public static char[] toCharArrayCustom(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
}