package org.cvshandling.assignment;
import java.io.*;
import java.util.regex.*;
public class ValidateCSV {
    public static void main(String[] args) {
        String filePath = "data.csv"; // Change this to your CSV file path
        validateCSV(filePath);
    }

    public static void validateCSV(String filePath) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "^[0-9]{10}$";
        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line = br.readLine(); // Read header
            System.out.println("Validating CSV Data...\n");

            while ((line = br.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length < 3) {
                    System.out.println("Invalid row (missing fields): " + line);
                    continue;
                }

                String name = fields[0].trim();
                String email = fields[1].trim();
                String phone = fields[2].trim();

                Matcher emailMatcher = emailPattern.matcher(email);
                Matcher phoneMatcher = phonePattern.matcher(phone);

                if (!emailMatcher.matches()) {
                    System.out.println("Invalid Email: " + email + " in row: " + line);
                }
                if (!phoneMatcher.matches()) {
                    System.out.println("Invalid Phone Number: " + phone + " in row: " + line);
                }
            }
            System.out.println("\nValidation Complete.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

