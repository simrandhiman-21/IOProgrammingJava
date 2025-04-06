package org.cvshandling.assignment.JsonToXML;

import org.json.JSONObject;
import org.json.XML;

public class JsonToXmlConverter {
    public static void main(String[] args) {
        String json = """
        {
          "user": {
            "name": "Alice",
            "age": 30,
            "email": "alice@example.com"
          }
        }
        """;

        JSONObject jsonObject = new JSONObject(json);
        String xml = XML.toString(jsonObject); // Converts JSON to XML

        System.out.println("XML Output:\n" + xml);
    }
}

