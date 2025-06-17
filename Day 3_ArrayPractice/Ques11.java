public class Ques11 {

    // Method to store user input in a 2D array
    // Assuming 10 rows for 10 persons, 3 columns for weight (kg), height (cm), and BMI
    // BMI will be calculated and stored later.
    public static double[][] storePersonData(double[] weightsKg, double[] heightsCm) {
        if (weightsKg.length != 10 || heightsCm.length != 10) {
            System.out.println("Error: Please provide data for exactly 10 persons.");
            return null;
        }

        double[][] personData = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            personData[i][0] = weightsKg[i]; // Weight in kg
            personData[i][1] = heightsCm[i]; // Height in cm
        }
        return personData;
    }

    // Method to calculate BMI and populate the array
    public static void calculateAndPopulateBMI(double[][] personData) {
        if (personData == null) {
            return;
        }
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0]; // weight in kg
            double heightCm = personData[i][1]; // height in cm

            // Convert height from cm to meters
            double heightM = heightCm / 100.0;

            if (heightM > 0) { // Avoid division by zero
                double bmi = weight / (heightM * heightM);
                personData[i][2] = bmi; // Store BMI
            } else {
                personData[i][2] = 0.0; // Indicate invalid height
            }
        }
    }

    // Method to determine BMI status
    public static String determineBMIBasedOnStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            return "Overweight";
        } else if (bmi >= 40.0) { // Assuming >= 40.0 for Obese based on the image
            return "Obese";
        } else {
            return "Invalid BMI"; // For negative or unusually large values
        }
    }

    // Method to determine BMI status for all persons and return an array of statuses
    public static String[] determineAllBMIBasedOnStatus(double[][] personData) {
        if (personData == null) {
            return null;
        }
        String[] bmiStatuses = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            bmiStatuses[i] = determineBMIBasedOnStatus(personData[i][2]);
        }
        return bmiStatuses;
    }


    public static void main(String[] args) {
        // Example data for 10 persons (weights in kg, heights in cm)
        double[] weights = {60, 75, 55, 80, 70, 65, 90, 50, 72, 85};
        double[] heights = {170, 180, 160, 175, 168, 172, 190, 155, 170, 185};

        double[][] personsData = storePersonData(weights, heights);

        if (personsData != null) {
            calculateAndPopulateBMI(personsData);

            System.out.println("Person Data (Weight kg, Height cm, BMI):");
            for (int i = 0; i < personsData.length; i++) {
                System.out.printf("Person %d: %.1f kg, %.1f cm, BMI: %.2f%n",
                        (i + 1), personsData[i][0], personsData[i][1], personsData[i][2]);
            }

            String[] statuses = determineAllBMIBasedOnStatus(personsData);
            System.out.println("\nBMI Statuses:");
            for (int i = 0; i < statuses.length; i++) {
                System.out.println("Person " + (i + 1) + ": " + statuses[i]);
            }
        }
    }
}