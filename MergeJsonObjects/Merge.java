package org.json.assignment.MergeJsonObjects;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;

public class Merge {
    public static void main(String[] args) throws IOException {
        ObjectMapper objmapper = new ObjectMapper();
        JsonNode json1=objmapper.readTree(new File("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\json\\assignment\\MergeJsonObjects\\jsonfile1.json"));
        JsonNode json2=objmapper.readTree(new File("C:\\bridgelabz-workspace\\IOProgrammingJava\\src\\main\\java\\org\\json\\assignment\\MergeJsonObjects\\jsonfile2.json"));


        ObjectNode mergedjson=objmapper.createObjectNode();
        mergedjson.setAll((ObjectNode) json1);
        mergedjson.setAll((ObjectNode) json2);

        System.out.println(objmapper.writeValueAsString(mergedjson));


    }
}
