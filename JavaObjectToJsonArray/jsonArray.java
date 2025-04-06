package org.json.assignment.JavaObjectToJsonArray;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class jsonArray {
    public static void main(String[] args) {
        List<Person> people=new ArrayList<>();
        people.add(new Person("Alice",30));
        people.add(new Person("bob",25));

        ObjectMapper objmap=new ObjectMapper();
        try{
            String jsonArray=objmap.writeValueAsString(people);
            System.out.println(jsonArray);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
