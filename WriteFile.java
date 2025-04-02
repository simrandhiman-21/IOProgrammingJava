package org.cvshandling.assignment;

import com.opencsv.CSVWriter;

import java.io.BufferedWriter;
import java.io.*;
import java.io.IOException;

    //public class WriteFile {
//    public static void main(String[] args) throws Exception {
//        String path="C:\\bridgelabz-workspace\\IOProgramming\\CVShandling\\problems\\employe.csv";
//        try{
//            CSVWriter cw=new CSVWriter(new FileWriter(path));
//            cw.writeNext(new String[]{"1","java","IT","20000"});
//            cw.writeNext(new String[]{"1","java","IT","20000"});
//            cw.writeNext(new String[]{"1","java","IT","20000"});
//            cw.writeNext(new String[]{"1","java","IT","20000"});
//            System.out.println("CSV file written successfully.");
//
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
//}
    public class WriteFile {
        public static void main(String[] args) {
            String filePath = "C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\Student.csv";

//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//                writer.write("ID,Name,Department,Salary\n");
//                writer.write("104,Alice Williams,Finance,62000\n");
//                writer.write("105,Bob Johnson,Sales,58000\n");
//                System.out.println("CSV file written successfully!");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }

            try(CSVWriter writer=new CSVWriter(new FileWriter("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\employees.csv"))){
                String[] header={"ID", "Name", "Department", "Salary"};
                String[] emp1={"104", "Alice Williams", "Finance", "62000"};
                String[] emp2 = {"105", "Bob Johnson", "Sales", "58000"};

                writer.writeNext(header);
                writer.writeNext(emp1);
                writer.writeNext(emp2);
                System.out.println("CSV file written successfully using OpenCSV!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
