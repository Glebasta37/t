package utils;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Mission {
    private String mission_name;
    private String mission_id;
    private ArrayList<String> manufacturers;
    private ArrayList<String> payload_ids;
    private String wikipedia;
    private String website;
    private String twitter;
    private String description;

}
