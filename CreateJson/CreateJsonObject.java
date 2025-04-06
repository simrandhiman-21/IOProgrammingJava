package org.json.assignment.CreateJson;
import org.json.JSONObject;

import  java.util.*;

public class CreateJsonObject {
    public static void main(String[] args) {

        JSONObject student=new JSONObject();
        student.put("name","john deo");
        student.put("age",21);
        student.put("List of Subjects ->",List.of("Chemistry","Maths","Bio","Economics"));

        System.out.println(student.toString(4));

    }
}
