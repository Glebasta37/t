package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    private String payload_id;
    private ArrayList<Integer> norad_id;
    private Boolean reused;
    private ArrayList<String> customers;
    private String nationality;
    private String manufacturer;
    private String payload_type;
    private Double payload_mass_kg;
    private Double payload_mass_lbs;
    private String orbit;
    private OrbitParams orbit_params;
    private String cap_serial;
    private Double mass_returned_kg;
    private Double mass_returned_lbs;
    private Integer flight_time_sec;
    private String cargo_manifest;
}
