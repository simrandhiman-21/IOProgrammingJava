package org.cvshandling.assignment;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;

public class ModifyFile {
    public static void main(String[] args) throws IOException {

        ArrayList<String[]> list=new ArrayList<>();

        try(CSVReader reader=new CSVReader(new FileReader("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\employees.csv"))){
            String[] row;
            reader.readNext();
            while((row=reader.readNext())!=null) {
                  if(row[2].equalsIgnoreCase("it")){
                      double newsalary=Double.parseDouble(row[3]); //get
                      newsalary=newsalary*1.1;
                      row[3]=String.valueOf(newsalary); //update
                  }
                  list.add(row);
           }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try(CSVWriter writer=new CSVWriter(new FileWriter("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\modifiedFile.csv"))){
            writer.writeAll(list);
            System.out.println("CVS file Updated Successfully! ");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("CSV file updated successfully!");
    }
}
