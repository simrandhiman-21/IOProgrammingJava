package org.cvshandling.assignment;

import java.io.*;
import java.util.*;

class Student {
    private String name;
    private int age;
    private String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", email='" + email + "'}";
    }
}
public class CSVtoObject {
    public static List<Student> readCSV(String filePath) {
        List<Student> students = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length < 3) continue; // Ensure sufficient columns

                String name = data[0].trim();
                int age = Integer.parseInt(data[1].trim());
                String email = data[2].trim();

                students.add(new Student(name, age, email));
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = readCSV("data.csv");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
