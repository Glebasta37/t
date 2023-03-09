package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Payload {
    public String payload_id;
    public ArrayList<Integer> norad_id;
    public boolean reused;
    public ArrayList<String> customers;
    public String nationality;
    public String manufacturer;
    public String payload_type;
    public double payload_mass_kg;
    public double payload_mass_lbs;
    public String orbit;
    public OrbitParams orbit_params;
    public String cap_serial;
    public double mass_returned_kg;
    public double mass_returned_lbs;
    public int flight_time_sec;
    public String cargo_manifest;
}
