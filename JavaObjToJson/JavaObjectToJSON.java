package org.json.assignment.JavaObjToJson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.*;

public class JavaObjectToJSON {
    public static void main(String[] args) throws JsonProcessingException {
//        Student s1=new Student("java",21, List.of("Chemistry","Maths","Bio","Economics"));
//        Gson gobj=new Gson();
//        String ans=gobj.toJson(s1);
//        System.out.println(ans);

        org.json.assignment.JavaObjToJson.Car carobj=new org.json.assignment.JavaObjToJson.Car("black","fortuner","yes");
        Gson json=new Gson();
        String gsonstring=json.toJson(carobj);
        System.out.println("Json "+gsonstring);
    }
}
