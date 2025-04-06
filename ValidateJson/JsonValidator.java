package org.json.assignment.ValidateJson;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonValidator {
    public static void main(String[] args) {
        String jsonString="{\"name\":\"Alice\",\"age\":25,\"email\":\"Alice@example.com\"}";
        ObjectMapper mapper=new ObjectMapper();
        try{
            User user=mapper.readValue(jsonString,User.class);
            System.out.println("Json is Valid "+" User Name "+user.name);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
