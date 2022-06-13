package com.usmertihsan.Homework2.City.service;


import com.usmertihsan.Homework2.City.dto.CityDto;
import com.usmertihsan.Homework2.City.dto.CitySaveRequestDto;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;

import java.util.List;



public interface ICityService {

    CityDto saveNewCity(CitySaveRequestDto citySaveRequestDto);
    List<CityDto> findByCityPlateNo(String cityPlateNo);

}
