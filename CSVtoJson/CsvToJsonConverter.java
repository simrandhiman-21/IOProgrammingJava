package org.cvshandling.assignment.CSVtoJson;


import org.json.CDL;
import org.json.JSONArray;

    public class CsvToJsonConverter {
        public static void main(String[] args) {
            String csvData = """
        name,age,email
        Alice,30,alice@example.com
        Bob,25,bob@example.com
        """;

            JSONArray jsonArray = CDL.toJSONArray(csvData);
            System.out.println("JSON Output:");
            System.out.println(jsonArray.toString(2)); // Pretty print with 2-space indentation
        }
    }
