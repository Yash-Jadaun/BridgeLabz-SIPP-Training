public class Ques2 {

    public static double calculateWindChill(double temperature, double windSpeed) {
        // Formula for wind chill temperature
        double windChill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
        return windChill;
    }

    public static void main(String[] args) {
        // Example usage:
        double temp = 20.0; // Temperature in Fahrenheit
        double windSpd = 15.0; 
        double chill = calculateWindChill(temp, windSpd);
        System.out.println("The wind chill temperature is: " + chill + " °F");
    }
}