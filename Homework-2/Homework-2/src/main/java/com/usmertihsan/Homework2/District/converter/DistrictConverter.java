package com.usmertihsan.Homework2.District.converter;


import com.usmertihsan.Homework2.City.dto.CityDto;
import com.usmertihsan.Homework2.City.dto.CitySaveRequestDto;
import com.usmertihsan.Homework2.City.entity.City;
import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;
import com.usmertihsan.Homework2.District.entity.District;

import java.util.ArrayList;
import java.util.List;

public class DistrictConverter {

    public District saveReqConvertToDistrict(DistrictSaveRequestDto districtSaveRequestDto){
        District district = new District();
        district.setDistrictName(districtSaveRequestDto.getDistrictName());
        district.setCity(districtSaveRequestDto.getCity());

        return district;
    }

    public District convertToDistrict(DistrictDto districtDto){
        District district = new District();
        district.setDistrictName(districtDto.getDistrictName());
        district.setCity(districtDto.getCity());
        return district;
    }

    public DistrictDto convertToDistrictDto(District district){
        DistrictDto districtDto = new DistrictDto();
        districtDto.setDistrictName(district.getDistrictName());
        district.setCity(district.getCity());
        return districtDto;
    }


    public List<DistrictDto> convertToDistrictDtoList(List<District> districtList){
        List<DistrictDto> districtDtoList = new ArrayList<>();
        for (District district : districtList) {
            DistrictDto districtDto = convertToDistrictDto(district);
            districtDtoList.add(districtDto);
        }
        return districtDtoList;
    }
}
