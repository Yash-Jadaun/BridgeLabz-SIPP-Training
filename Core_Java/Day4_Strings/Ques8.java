import java.util.Scanner;

class Ques8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int length = getStringLength(inputString);
        System.out.println("Length of the string (custom method): " + length);
        System.out.println("Length of the string (built-in method): " + inputString.length());

        scanner.close();
    }

    public static int getStringLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            count++;
        }
        return count;
    }
}