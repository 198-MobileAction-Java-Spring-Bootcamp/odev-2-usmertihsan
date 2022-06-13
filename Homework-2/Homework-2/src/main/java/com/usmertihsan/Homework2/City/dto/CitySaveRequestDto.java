package com.usmertihsan.Homework2.City.dto;


import com.usmertihsan.Homework2.Country.entity.Country;
import lombok.Data;

@Data
public class CitySaveRequestDto {

    private String cityName;
    private String cityPlateNo;
    private Country country;
}
