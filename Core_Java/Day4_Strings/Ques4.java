import java.util.Scanner;

class Ques4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String lowerCaseBuiltIn = inputString.toLowerCase();
        String upperCaseBuiltIn = inputString.toUpperCase();

        String lowerCaseCustom = toLowerCaseCustom(inputString);
        String upperCaseCustom = toUpperCaseCustom(inputString);

        System.out.println("Built-in lowercase: " + lowerCaseBuiltIn);
        System.out.println("Custom lowercase: " + lowerCaseCustom);
        System.out.println("Built-in uppercase: " + upperCaseBuiltIn);
        System.out.println("Custom uppercase: " + upperCaseCustom);

        System.out.println("Built-in vs Custom Lowercase Match: " + lowerCaseBuiltIn.equals(lowerCaseCustom));
        System.out.println("Built-in vs Custom Uppercase Match: " + upperCaseBuiltIn.equals(upperCaseCustom));

        scanner.close();
    }

    public static String toLowerCaseCustom(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }

    public static String toUpperCaseCustom(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        return new String(chars);
    }
}