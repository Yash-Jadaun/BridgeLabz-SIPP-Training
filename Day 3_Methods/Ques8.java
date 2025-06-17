public class Ques8 {

    public static double km2miles(double km) {
        return km * 0.621371;
    }

    public static double miles2km(double miles) {
        return miles * 1.60934;
    }

    public static double meters2feet(double meters) {
        return meters * 3.28084;
    }

    public static double feet2meters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println("10 km to miles: " + km2miles(10) + " miles");
        System.out.println("10 miles to km: " + miles2km(10) + " km");
        System.out.println("5 meters to feet: " + meters2feet(5) + " feet");
        System.out.println("5 feet to meters: " + feet2meters(5) + " meters");
    }
}