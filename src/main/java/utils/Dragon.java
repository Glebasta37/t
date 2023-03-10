package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Dragon {
    private String id;
    private String name;
    private String type;
    private Boolean active;
    private Integer crew_capacity;
    private Integer sidewall_angle_deg;
    private Integer orbit_duration_yr;
    private Integer dry_mass_kg;
    private Integer dry_mass_lb;
    private String first_flight;
    private HeatShield heat_shield;
    private ArrayList<Thruster> thrusters;
    private LaunchPayloadMass launch_payload_mass;
    private LaunchPayloadVol launch_payload_vol;
    private ReturnPayloadMass return_payload_mass;
    private ReturnPayloadVol return_payload_vol;
    private PressurizedCapsule pressurized_capsule;
    private Trunk trunk;
    private HeightWTrunk height_w_trunk;
    private Diameter diameter;
    private String wikipedia;
    private String description;
}
