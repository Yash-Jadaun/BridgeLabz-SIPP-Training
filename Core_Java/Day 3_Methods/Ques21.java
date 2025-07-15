import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class Ques21 {
// Method to generate a six-digit OTP
    public static int generateSixDigitOTP() {
        Random random = new Random();
        return random.nextInt(900000) + 100000;
    }

    public static boolean validateUniqueOTPs(int[] otps) {
        Set<Integer> uniqueOtps = new HashSet<>();
        for (int otp : otps) {
            if (!uniqueOtps.add(otp)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numberOfOtps = 10;
        int[] generatedOtps = new int[numberOfOtps];

        System.out.println("Generating 10 OTPs:");
        for (int i = 0; i < numberOfOtps; i++) {
            generatedOtps[i] = generateSixDigitOTP();
            System.out.println("OTP " + (i + 1) + ": " + generatedOtps[i]);
        }

        System.out.println("\nAll Generated OTPs: " + Arrays.toString(generatedOtps));

        boolean areUnique = validateUniqueOTPs(generatedOtps);
        if (areUnique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Some generated OTPs are not unique.");
        }
    }
}