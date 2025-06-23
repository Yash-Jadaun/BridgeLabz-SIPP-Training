package EXTRAS_built_in_functions;

// Problem 8: Temperature Converter
import java.util.Scanner;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        double cTemp = scanner.nextDouble();
        System.out.println("Fahrenheit: " + celsiusToFahrenheit(cTemp));

        System.out.println("Enter temperature in Fahrenheit:");
        double fTemp = scanner.nextDouble();
        System.out.println("Celsius: " + fahrenheitToCelsius(fTemp));

        scanner.close();
    }
}