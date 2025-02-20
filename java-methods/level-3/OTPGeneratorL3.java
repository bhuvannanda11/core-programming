import java.util.HashSet;
import java.util.Set;

public class OTPGeneratorL3 {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Generate a number between 100000 and 999999 (6 digits)
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to ensure all generated OTPs are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        Set<Integer> otpSet = new HashSet<>();
        
        // Loop through the OTP array and add each OTP to the set
        for (int otp : otpArray) {
            // If the OTP already exists in the set, return false (not unique)
            if (!otpSet.add(otp)) {
                return false;
            }
        }
        
        // If no duplicates were found, return true (all OTPs are unique)
        return true;
    }

    // Main method to generate and validate 10 unique OTPs
    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
        }

        // Check if the OTPs are unique
        if (areOTPsUnique(otpArray)) {
            System.out.println("All generated OTPs are unique:");
            for (int otp : otpArray) {
                System.out.println(otp);
            }
        } else {
            System.out.println("The OTPs are not unique.");
        }
    }
}
