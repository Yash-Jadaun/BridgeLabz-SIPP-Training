import java.util.Scanner;

class Ques16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String inputString = scanner.nextLine();

        String trimmedBuiltIn = inputString.trim();
        String trimmedCustom = trimCustom(inputString);

        System.out.println("Original string: '" + inputString + "'");
        System.out.println("Trimmed (built-in): '" + trimmedBuiltIn + "'");
        System.out.println("Trimmed (custom):   '" + trimmedCustom + "'");
        System.out.println("Built-in vs Custom Match: " + trimmedBuiltIn.equals(trimmedCustom));

        scanner.close();
    }

    public static String trimCustom(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        int start = 0;
        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        int end = str.length() - 1;
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        if (start > end) { // String was all spaces
            return "";
        }
        return str.substring(start, end + 1);
    }
}