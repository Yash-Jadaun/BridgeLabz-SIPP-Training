package EXTRAS_built_in_functions;

import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.of(2023, 10, 26); // Example date
        System.out.println("Initial Date: " + initialDate);

        LocalDate newDate = initialDate.plusDays(10).plusMonths(1).plusYears(2).minusWeeks(3);
        System.out.println("Modified Date: " + newDate);
    }
}