package com.usmertihsan.Homework2.City.service;

import com.usmertihsan.Homework2.City.converter.CityConverter;
import com.usmertihsan.Homework2.City.dao.ICityDao;
import com.usmertihsan.Homework2.City.dto.CityDto;
import com.usmertihsan.Homework2.City.dto.CitySaveRequestDto;
import com.usmertihsan.Homework2.City.entity.City;
import com.usmertihsan.Homework2.Country.converter.CountryConverter;
import com.usmertihsan.Homework2.Country.dao.ICountryDao;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImple implements ICityService{

    @Autowired
    private ICityDao cityDao;

    CityConverter cityConverter= new CityConverter();

    @Override
    public CityDto saveNewCity(CitySaveRequestDto citySaveRequestDto)
    {
        City city = cityConverter.saveReqConvertToCity(citySaveRequestDto);
        city = cityDao.save(city);
        CityDto cityDto = cityConverter.convertToCityDto(city);
        return cityDto;
    }

    @Override
    public List<CityDto> findByCityPlateNo(String cityPlateNo)
    {
        List<City> cityList = cityDao.findByCityPlateNo(cityPlateNo);
        List<CityDto> cityDtoList = cityConverter.convertToCityDtoList(cityList);

        return cityDtoList;
    }





}
