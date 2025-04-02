package org.cvshandling.assignment;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.Scanner;

public class Searchcvs {
   public static void main(String[] args) throws Exception {

        /*String filePath = "C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\employees.csv";// CSV file path

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter Employee Name to Search: ");
            String searchName = scanner.nextLine().trim(); // Get user input
            scanner.close();

            String line = br.readLine(); // Read header
            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] data = line.split(","); // Split CSV line

                String name = data[1].trim(); // Employee Name (Assuming it's in the 2nd column)
                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found:");
                    System.out.println("Department: " + data[2]); // Department
                    System.out.println("Salary: " + data[3]);     // Salary
                    found = true;
                    break; // Stop searching after finding the first match
                }
            }
            br.close();

            if (!found) {
                System.out.println("Employee not found!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
         */

       System.out.println("Enter Employe name");
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();

       try(CSVReader reader=new CSVReader(new FileReader("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\employees.csv"))){
           String[] row;
           while((row=reader.readNext())!=null){
               if(row[1].equalsIgnoreCase(name)){
                   System.out.println(" Department "+row[2]+" salary "+row[3]);
               }
           }
           reader.close();

       } catch (Exception e) {
           System.out.println(e.getMessage());
       }













    }
}

