package EXTRAS_built_in_functions;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Format 1 (dd/MM/yyyy): " + now.format(f1));

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2 (yyyy-MM-dd): " + now.format(f2));

        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + now.format(f3));
    }
}