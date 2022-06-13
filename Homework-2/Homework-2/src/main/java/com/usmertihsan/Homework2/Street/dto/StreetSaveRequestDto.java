package com.usmertihsan.Homework2.Street.dto;

import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import lombok.Data;

@Data
public class StreetSaveRequestDto {
    private String streetName;
    private String apartmantNumber;
    private String doorNumber;
    private Neighborhood neighborhood;
}
