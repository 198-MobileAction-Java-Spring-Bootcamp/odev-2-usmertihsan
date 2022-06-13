package com.usmertihsan.Homework2.Neighborhood.dto;

import com.usmertihsan.Homework2.District.entity.District;
import lombok.Data;

@Data
public class NeighborhoodSaveRequestDto {

    private String neighborhoodName;
    private District district;
}
