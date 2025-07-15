package EXTRAS_built_in_functions;

// Problem 4: Date Comparison
import java.time.LocalDate;

public class DateComparison {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2023, 5, 15);
        LocalDate date2 = LocalDate.of(2024, 1, 20);
        LocalDate date3 = LocalDate.of(2023, 5, 15);

        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        System.out.println("Date 3: " + date3);

        System.out.println("Is Date 1 before Date 2? " + date1.isBefore(date2));
        System.out.println("Is Date 1 after Date 2? " + date1.isAfter(date2));
        System.out.println("Is Date 1 equal to Date 3? " + date1.isEqual(date3));
    }
}