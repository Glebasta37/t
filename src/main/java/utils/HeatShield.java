package utils;

import lombok.Data;

@Data
public class HeatShield {
    private String material;
    private Double size_meters;
    private Integer temp_degrees;
    private String dev_partner;
}
