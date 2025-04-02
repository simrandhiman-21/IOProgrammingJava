package org.cvshandling.assignment;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class FilterMarks {
    public static void main(String[] args) throws IOException, CsvValidationException {
        try (CSVReader reader = new CSVReader(new FileReader("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\Student.csv"))){
            reader.readNext();

            String[] row;

            while ((row = reader.readNext()) != null) {
                if (row.length < 4) continue;
                try {
                    int marks = Integer.parseInt(row[3]);
                    if (marks > 80) {
                        System.out.println(row[0] + " " + row[1] + " " + row[2]);
                    }
                } catch (Exception e) {

                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
