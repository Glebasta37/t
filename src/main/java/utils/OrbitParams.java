package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrbitParams {
    public String reference_system;
    public String regime;
    public double longitude;
    public double semi_major_axis_km;
    public double eccentricity;
    public double periapsis_km;
    public double apoapsis_km;
    public double inclination_deg;
    public double period_min;
    public int lifespan_years;
    public Date epoch;
    public double mean_motion;
    public double raan;
}
