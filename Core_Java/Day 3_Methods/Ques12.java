public class Ques12 {

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertFeetToYards(double feet) {
        return feet / 3;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
      
        System.out.println("10 yards to feet: " + convertYardsToFeet(10) + " feet");
        System.out.println("10 feet to yards: " + convertFeetToYards(10) + " yards");
        System.out.println("5 meters to inches: " + convertMetersToInches(5) + " inches");
        System.out.println("5 inches to meters: " + convertInchesToMeters(5) + " meters");
        System.out.println("10 inches to centimeters: " + convertInchesToCentimeters(10) + " cm");
    }
}