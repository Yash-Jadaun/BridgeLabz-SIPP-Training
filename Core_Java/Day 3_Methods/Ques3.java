public class Ques3 {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        // Check for division by zero
        if (divisor == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return new int[]{0, 0}; 
        }

        int quotient = number / divisor;
        int remainder = number % divisor;

        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        // Example usage:
        int num = 25;
        int div = 4;
        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Number: " + num + ", Divisor: " + div);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        num = 10;
        div = 3;
        result = findRemainderAndQuotient(num, div);
        System.out.println("\nNumber: " + num + ", Divisor: " + div);
        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);
    }
}