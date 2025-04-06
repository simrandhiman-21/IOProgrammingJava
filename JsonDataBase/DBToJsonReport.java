package org.cvshandling.assignment.JsonDataBase;

import java.sql.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class DBToJsonReport {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database";
        String user = "your_username";
        String password = "your_password";

        String query = "SELECT id, name, age FROM users";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            JSONArray jsonArray = new JSONArray();

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                JSONObject obj = new JSONObject();
                for (int i = 1; i <= columnCount; i++) {
                    obj.put(metaData.getColumnName(i), rs.getObject(i));
                }
                jsonArray.put(obj);
            }

            System.out.println("JSON Report:");
            System.out.println(jsonArray.toString(2)); // Pretty print

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
