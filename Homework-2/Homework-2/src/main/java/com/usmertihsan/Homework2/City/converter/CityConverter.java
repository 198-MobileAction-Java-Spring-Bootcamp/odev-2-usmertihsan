package com.usmertihsan.Homework2.City.converter;

import com.usmertihsan.Homework2.City.dto.CityDto;
import com.usmertihsan.Homework2.City.dto.CitySaveRequestDto;
import com.usmertihsan.Homework2.City.entity.City;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;
import com.usmertihsan.Homework2.Country.entity.Country;

import java.util.ArrayList;
import java.util.List;


public class CityConverter {

    public City saveReqConvertToCity(CitySaveRequestDto citySaveRequestDto){
        City city = new City();
        city.setCityName(citySaveRequestDto.getCityName());
        city.setCityPlateNo(citySaveRequestDto.getCityPlateNo());
        city.setCountry(citySaveRequestDto.getCountry());
        return city;
    }

    public City convertToCity(CityDto cityDto){
        City city = new City();
        city.setCityName(cityDto.getCityName());
        city.setCityPlateNo(cityDto.getCityPlateNo());
        city.setCountry(cityDto.getCountry());
        return city;
    }

    public CityDto convertToCityDto(City city){
        CityDto cityDto = new CityDto();
        cityDto.setCityName(city.getCityName());
        cityDto.setCityPlateNo(city.getCityPlateNo());
        cityDto.setCountry(city.getCountry());
        return cityDto;
    }


    public List<CityDto> convertToCityDtoList(List<City> cityList){
        List<CityDto> cityDtoList = new ArrayList<>();
        for (City city : cityList) {
            CityDto cityDto = convertToCityDto(city);
            cityDtoList.add(cityDto);
        }
        return cityDtoList;
    }





}
