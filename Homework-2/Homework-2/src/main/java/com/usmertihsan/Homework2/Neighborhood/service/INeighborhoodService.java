package com.usmertihsan.Homework2.Neighborhood.service;

import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;
import com.usmertihsan.Homework2.District.entity.District;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;

public interface INeighborhoodService {

    NeighborhoodDto saveNewNeighborhood(NeighborhoodSaveRequestDto neighborhoodSaveRequestDto);
    Neighborhood updateNeighborhoodName(String neighborhoodName, Long neighborhoodId);




}
