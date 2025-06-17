public class Ques7 {

    public static boolean isSpringSeason(int month, int day) {
        // Spring season is from March 20 to June 20.
        if (month == 3) {
            return day >= 20 && day <= 31;
        } else if (month == 4 || month == 5) {
            return day >= 1 && day <= 31; // Assuming all days are valid for these months
        } else if (month == 6) {
            return day >= 1 && day <= 20;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("Is March 25 a spring season? " + isSpringSeason(3, 25));    // true
        System.out.println("Is June 20 a spring season? " + isSpringSeason(6, 20));    // true
        System.out.println("Is June 21 a spring season? " + isSpringSeason(6, 21));    // false
        System.out.println("Is February 15 a spring season? " + isSpringSeason(2, 15)); // false
        System.out.println("Is April 10 a spring season? " + isSpringSeason(4, 10));    // true
    }
}