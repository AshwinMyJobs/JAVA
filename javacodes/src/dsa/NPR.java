package dsa;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class NPR {

    public static void main(String[] args) {

        String s1 = "ABC";
        String s2 = "ACB";
        String s3 = "BAC";
        String s4 = "BCA";
        String s5 = "CAB";
        String s6 = "CBA";

        System.out.println("s1 hash code " + s1.hashCode());
        System.out.println("s2 hash code " + s2.hashCode());
        System.out.println("s3 hash code " + s3.hashCode());
        System.out.println("s4 hash code " + s4.hashCode());
        System.out.println("s5 hash code " + s5.hashCode());
        System.out.println("s6 hash code " + s6.hashCode());

        System.out.println("========================================================");
        System.out.println("s1 hash code " + s1.hashCode() + " %3 = " + (s1.hashCode()+1)%3 );
        System.out.println("s2 hash code " + s2.hashCode() + " %3 = " + (s2.hashCode()+2)%3 );
        System.out.println("s3 hash code " + s3.hashCode() + " %3 = " + (s3.hashCode()+3)%3 );
        System.out.println("s4 hash code " + s4.hashCode() + " %3 = " + (s4.hashCode()+4)%3 );
        System.out.println("s5 hash code " + s5.hashCode() + " %3 = " + (s5.hashCode()+5)%3 );
        System.out.println("s6 hash code " + s6.hashCode() + " %3 = " + (s6.hashCode()+6)%3 );


        System.out.println("========================================================");
        System.out.println("s1 SHA-256 hash hexstring " + generateSHA256Hash("1") );
        System.out.println("s2 SHA-256 hash hexstring " + generateSHA256Hash("s2") );
        System.out.println("s3 SHA-256 hash hexstring " + generateSHA256Hash("s3") );


        System.out.println("===================================================================================");
        System.out.println(generateSHA256Hash("1"));
        System.out.println(generateSHA256Hash("2"));
        System.out.println(generateSHA256Hash("3"));

    }


    public static String generateSHA256Hash(String input) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            // Perform the hash computation
            byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            // Convert byte array into a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedhash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
