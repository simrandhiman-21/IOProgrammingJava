package org.cvshandling.assignment.FilterJson;
import org.json.JSONArray;
import org.json.JSONObject;

public class FilterUsers {
        public static void main(String[] args) {
            String jsonData = "[{\"name\": \"Alice\", \"age\": 30}, {\"name\": \"Bob\", \"age\": 22}, {\"name\": \"Charlie\", \"age\": 28}]";

            JSONArray users = new JSONArray(jsonData);

            System.out.println("Users older than 25:");
            for (int i = 0; i < users.length(); i++) {
                JSONObject user = users.getJSONObject(i);
                int age = user.getInt("age");
                if (age > 25) {
                    System.out.println(user);
                }
            }
        }
}
