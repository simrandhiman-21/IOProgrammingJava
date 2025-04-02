package org.cvshandling.assignment;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountFiles {
    public static void main(String[] args) throws CsvValidationException, IOException {
//        try {
//            String path = "C:\\bridgelabz-workspace\\IOProgramming\\CVShandling\\problems\\students.csv";
//            BufferedReader br = new BufferedReader(new FileReader(path));
//            String line = br.readLine();
//            int count = 0;
//            while (line != null) {
//                count++;
//                line = br.readLine();
//            }
//            System.out.println("Count is -> "+--count);
//            br.close();
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }

        CSVReader reader=new CSVReader(new FileReader("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\Student.csv"));
        reader.readNext();
        int count=0;
        while(reader.readNext()!=null)count++;
        reader.close();
        System.out.println("Total Records: "+count);
    }
}
