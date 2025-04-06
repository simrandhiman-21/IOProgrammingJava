package org.cvshandling.assignment.ReadJsonPrint;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SimpleJSONReader {
    public static void main(String[] args) {
        try {
            String data = new String(Files.readAllBytes(Paths.get("data.json")));
            JSONObject json = new JSONObject(data);

            for (String key : json.keySet()) {
                System.out.println(key + ": " + json.get(key));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
