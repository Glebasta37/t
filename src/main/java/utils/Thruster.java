package utils;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Thruster {
    private String type;
    private Integer amount;
    private Integer pods;
    private String fuel_1;
    private String fuel_2;
    private Thrust thrust;
}
