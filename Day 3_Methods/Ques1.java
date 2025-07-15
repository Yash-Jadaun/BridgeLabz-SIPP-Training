import java.lang.Math;

public class Ques1 {

    public static double calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sinValue = Math.sin(radians);
        double cosValue = Math.cos(radians);
        double tanValue = Math.tan(radians);

        System.out.println("For angle " + angle + " degrees:");
        System.out.println("Sine: " + sinValue);
        System.out.println("Cosine: " + cosValue);
        System.out.println("Tangent: " + tanValue);

        // You can return any of the calculated values or void if just printing
        return 0.0; // Returning a dummy value as the problem asks to calculate
    }

    public static void main(String[] args) {
        // Example usage:
        calculateTrigonometricFunctions(30.0); 
        calculateTrigonometricFunctions(90.0); 
    }
}



//university course enrollment system
// enroll in course and faculty can assign grades
// class student ciurse faculty enrollment
// constructure used to create students with/without elective pref
// access modifiers private for internal gpa fields public ,method to access transcript
// interface graded wioth method assignGrade()
// operators gpa calculations and comparision (using +,/,etc)
// OOPS
// Encap:Secure handlihng of grades
// Inherietence Undergraduate Postgraduate extend student