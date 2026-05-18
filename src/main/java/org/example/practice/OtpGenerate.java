package practice;

import java.util.Random;

public class OtpGenerate {
	
	 private static final String NUMBERS = "0123456789";
	
	 public static String generateOTP(int length) {
	        Random random = new Random();
	        StringBuilder otp = new StringBuilder();
	        
	        // Generate 'length' digits OTP
	        for (int i = 0; i < length; i++) {
	            otp.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
	        }
	        
	        return otp.toString();
	    }
	 
	 public static void main(String[] args) {
		
		 int length = 4; // Length of the OTP
	        System.out.println("Generated OTP: " + generateOTP(length));
	}

}
