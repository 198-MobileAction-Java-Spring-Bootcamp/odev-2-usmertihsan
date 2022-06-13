package com.usmertihsan.Homework2.Neighborhood.converter;

import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;
import com.usmertihsan.Homework2.District.entity.District;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;

import java.util.ArrayList;
import java.util.List;

public class NeighborhoodConverter {


    public Neighborhood saveReqConvertToNeighborhood(NeighborhoodSaveRequestDto neighborhoodSaveRequestDto){
        Neighborhood neighborhood = new Neighborhood();
        neighborhood.setNeighborhoodName(neighborhoodSaveRequestDto.getNeighborhoodName());
        neighborhood.setDistrict(neighborhoodSaveRequestDto.getDistrict());
        return neighborhood;
    }

    public Neighborhood convertToNeighborhood(NeighborhoodDto neighborhoodDto){
        Neighborhood neighborhood = new Neighborhood();
        neighborhood.setNeighborhoodName(neighborhoodDto.getNeighborhoodName());
        neighborhood.setDistrict(neighborhoodDto.getDistrict());
        return neighborhood;
    }
    public NeighborhoodDto convertToNeighborhoodDto(Neighborhood neighborhood){
        NeighborhoodDto neighborhoodDto = new NeighborhoodDto();
        neighborhoodDto.setNeighborhoodName(neighborhood.getNeighborhoodName());
        neighborhoodDto.setDistrict(neighborhood.getDistrict());
        return neighborhoodDto;
    }


    public List<NeighborhoodDto> convertToNeighborhoodDtoList(List<Neighborhood> neighborhoodList){
        List<NeighborhoodDto> neighborhoodDtoList = new ArrayList<>();
        for (Neighborhood neighborhood : neighborhoodList) {
            NeighborhoodDto neighborhoodDto = convertToNeighborhoodDto(neighborhood);
            neighborhoodDtoList.add(neighborhoodDto);
        }
        return neighborhoodDtoList;
    }
}
