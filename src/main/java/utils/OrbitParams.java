package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrbitParams {
    private String reference_system;
    private String regime;
    private Double longitude;
    private Double semi_major_axis_km;
    private Double eccentricity;
    private Double periapsis_km;
    private Double apoapsis_km;
    private Double inclination_deg;
    private Double period_min;
    private Integer lifespan_years;
    private Date epoch;
    private Double mean_motion;
    private Double raan;
}
