public class Ques4 {

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = number1;
        int largest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }

        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
    
        int n1 = 10, n2 = 5, n3 = 20;
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Numbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        n1 = -5; n2 = 0; n3 = 100;
        result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("\nNumbers: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}