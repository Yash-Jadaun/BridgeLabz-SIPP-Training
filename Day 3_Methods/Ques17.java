public class Ques17 {

    // 1. Method to take inputs for 3 points
    // This will be done in main method or by passing arrays.
    // The problem statement implies a method to "take inputs",
    // but the rest of the problem uses fixed inputs.
    // We will use method parameters for x1, y1, x2, y2, x3, y3.

    // 2. Method to find the 3 points that are collinear using the slope formula.
    // Three points (x1, y1), (x2, y2), and (x3, y3) are collinear if:
    // slope AB = slope BC
    // (y2 - y1) / (x2 - x1) = (y3 - y2) / (x3 - x2)
    // To avoid division by zero, use the cross-multiplication form:
    // (y2 - y1) * (x3 - x2) = (y3 - y2) * (x2 - x1)
    public static boolean arePointsCollinear(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        // Use long to prevent overflow for large coordinates
        long slopeAB_numerator = (long) (y2 - y1);
        long slopeAB_denominator = (long) (x2 - x1);
        long slopeBC_numerator = (long) (y3 - y2);
        long slopeBC_denominator = (long) (x3 - x2);

        // Check for vertical lines (denominator is 0)
        if (slopeAB_denominator == 0 && slopeBC_denominator == 0) {
            // Both are vertical lines, they are collinear if they share the same x-coordinate
            return x1 == x2 && x2 == x3;
        } else if (slopeAB_denominator == 0 || slopeBC_denominator == 0) {
            // One is vertical, the other is not, so not collinear
            return false;
        }

        // Check using cross-multiplication to avoid floating-point inaccuracies
        return (slopeAB_numerator * slopeBC_denominator) == (slopeBC_numerator * slopeAB_denominator);
    }

    // 3. Method to find the area of the triangle formula
    // Area = 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
    // If area is 0, the points are collinear.
    public static double calculateTriangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area;
    }

    public static void main(String[] args) {
        // Example points for sampling
        // Collinear points: (2, 4), (4, 6), (6, 8)
        // Slope AB = (6-4)/(4-2) = 2/2 = 1
        // Slope BC = (8-6)/(6-4) = 2/2 = 1
        System.out.println("Checking points (2, 4), (4, 6), (6, 8):");
        boolean collinearSlope = arePointsCollinear(2, 4, 4, 6, 6, 8);
        System.out.println("Are points collinear (slope method)? " + collinearSlope);
        double area1 = calculateTriangleArea(2, 4, 4, 6, 6, 8);
        System.out.println("Area of triangle (area method): " + area1);
        System.out.println("Are points collinear (area method)? " + (area1 == 0));


        System.out.println("\nChecking points (2, 4), (6, 8), (3, 1):");
        boolean collinearSlope2 = arePointsCollinear(2, 4, 6, 8, 3, 1);
        System.out.println("Are points collinear (slope method)? " + collinearSlope2);
        double area2 = calculateTriangleArea(2, 4, 6, 8, 3, 1);
        System.out.println("Area of triangle (area method): " + area2);
        System.out.println("Are points collinear (area method)? " + (area2 == 0));
    }
}