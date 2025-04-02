package org.cvshandling.assignment;

import com.opencsv.CSVReader;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) throws Exception {
//        File filePath = new File("C:/bridgelabz-workspace/IOProgrammingJava/src/main/java/org/cvshandling/assignment/employees.csv");
//        BufferedReader br = new BufferedReader(new FileReader(filePath));
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();
        try(CSVReader reader=new CSVReader(new FileReader("C:/bridgelabz-workspace/IOProgrammingJava/src/main/java/org/cvshandling/assignment/employees.csv"))){
            String[] nextLine;
            while((nextLine=reader.readNext())!=null) {
                System.out.println("Id : " + nextLine[0] +" --> "+ " Name :" + nextLine[1]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}