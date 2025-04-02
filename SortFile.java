package org.cvshandling.assignment;
import com.opencsv.CSVReader;
import java.io.FileReader;

import java.util.*;

public class SortFile {
    public static void main(String[] args) {
        try(CSVReader reader=new CSVReader(new FileReader("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\cvshandling\\assignment\\employees.csv"))){
            List<String[]> list=reader.readAll();

            list.remove(0);//remove header
            list.removeIf(row ->row.length<4 || row[3].trim().isEmpty());
            list.sort((a,b)->Integer.compare(Integer.parseInt(b[3]),Integer.parseInt(a[3])));

            System.out.println("Top 5 Salaries ");
            for(int i=0;i<Math.min(5,list.size());i++){
                System.out.println(String.join(",",list.get(i)));
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
