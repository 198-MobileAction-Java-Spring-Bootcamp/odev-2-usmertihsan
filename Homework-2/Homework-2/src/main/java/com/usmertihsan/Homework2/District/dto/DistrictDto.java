package com.usmertihsan.Homework2.District.dto;


import com.usmertihsan.Homework2.City.entity.City;
import lombok.Data;



@Data
public class DistrictDto {

    private Long districtId;
    private String districtName;
    private City city;
}
