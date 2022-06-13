package com.usmertihsan.Homework2.District.dto;

import com.usmertihsan.Homework2.City.entity.City;
import lombok.Data;

@Data
public class DistrictSaveRequestDto {
    private String districtName;
    private City city;
}
