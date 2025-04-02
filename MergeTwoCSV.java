package org.cvshandling.assignment;
import java.io.*;
import java.util.*;

public class MergeTwoCSV {

    public static void main(String[] args) {
        String file1 = "students1.csv";
        String file2 = "students2.csv";
        String outputFile = "merged_students.csv";

        Map<String, String[]> studentData = new HashMap<>();

        // Read the first file (ID, Name, Age)
        try (BufferedReader br = new BufferedReader(new FileReader(file1))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    studentData.put(parts[0], new String[]{parts[1], parts[2], "", ""});
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read the second file (ID, Marks, Grade)
        try (BufferedReader br = new BufferedReader(new FileReader(file2))) {
            String line;
            br.readLine(); // Skip header
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3 && studentData.containsKey(parts[0])) {
                    String[] existingData = studentData.get(parts[0]);
                    existingData[2] = parts[1]; // Marks
                    existingData[3] = parts[2]; // Grade
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the merged data to a new file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
            bw.write("ID,Name,Age,Marks,Grade\n");
            for (Map.Entry<String, String[]> entry : studentData.entrySet()) {
                String[] data = entry.getValue();
                bw.write(entry.getKey() + "," + data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "\n");
            }
            System.out.println("Merged CSV file created successfully: " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
