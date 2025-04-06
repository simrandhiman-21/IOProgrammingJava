package org.cvshandling.assignment.ValidateJson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String email = "user@example.com"; // change this to test

        if (isValidEmail(email)) {
            System.out.println("Valid email: " + email);
        } else {
            System.out.println("Invalid email: " + email);
        }
    }

    public static boolean isValidEmail(String email) {
        // Basic email regex pattern
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
        }
}
