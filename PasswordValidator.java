package gr.aueb.cf.ch19.homework;

import java.util.regex.*;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Regular expression pattern
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!?*_\\-]).{8,}$";
        // Compile the pattern
        Pattern pattern = Pattern.compile(regex);
        // Check if the password matches the pattern
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        // Example usage
        String password = "P@ssw0rd!";
        if (isValidPassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
