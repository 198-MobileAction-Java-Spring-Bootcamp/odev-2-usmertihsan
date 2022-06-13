package com.usmertihsan.Homework2.Street.converter;

import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import com.usmertihsan.Homework2.Street.dto.StreetDto;
import com.usmertihsan.Homework2.Street.dto.StreetSaveRequestDto;
import com.usmertihsan.Homework2.Street.entity.Street;

import java.util.ArrayList;
import java.util.List;

public class StreetConverter {

    public Street saveReqConvertToStreet(StreetSaveRequestDto streetSaveRequestDto){
        Street street = new Street();
        street.setStreetName(streetSaveRequestDto.getStreetName());
        street.setApartmantNumber(streetSaveRequestDto.getApartmantNumber());
        street.setDoorNumber(streetSaveRequestDto.getDoorNumber());
        street.setNeighborhood(streetSaveRequestDto.getNeighborhood());
        return street;
    }

    public Street convertToStreet(StreetDto streetDto){
        Street street = new Street();
        street.setStreetName(streetDto.getStreetName());
        street.setApartmantNumber(streetDto.getApartmantNumber());
        street.setDoorNumber(streetDto.getDoorNumber());
        street.setNeighborhood(streetDto.getNeighborhood());
        return street;
    }
    public StreetDto convertToStreetDto(Street street){
        StreetDto streetDto = new StreetDto();
        streetDto.setStreetName(street.getStreetName());
        streetDto.setApartmantNumber(street.getApartmantNumber());
        streetDto.setDoorNumber(street.getDoorNumber());
        streetDto.setNeighborhood(street.getNeighborhood());
        return streetDto;
    }


    public List<StreetDto> convertToStreetDtoList(List<Street> streetList){
        List<StreetDto> streetDtoList = new ArrayList<>();
        for (Street street : streetList) {
            StreetDto streetDto = convertToStreetDto(street);
            streetDtoList.add(streetDto);
        }
        return streetDtoList;
    }


}
