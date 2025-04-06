package org.json.assignment.Parsejson;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.*;

public class ParsingJson {
    public static void main(String[] args) {

        ObjectMapper jsonmapper=new ObjectMapper();
        try{
            File file=new File("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\json\\assignment\\Parsejson\\data.json");
            JsonNode jsonnode=jsonmapper.readTree(file);
            ArrayList<Person> list=new ArrayList<>();

            for(JsonNode node:jsonnode){
                int age=node.get("age").asInt();
                if(age>25){
                    String name=node.get("name").asText();
                    list.add(new Person(name,age));
                }
            }

            //printing
            for(Person person:list){
                System.out.println(person);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
