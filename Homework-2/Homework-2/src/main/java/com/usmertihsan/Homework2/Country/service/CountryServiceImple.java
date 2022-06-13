package com.usmertihsan.Homework2.Country.service;

import com.usmertihsan.Homework2.Country.converter.CountryConverter;
import com.usmertihsan.Homework2.Country.dao.ICountryDao;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImple implements ICountryService {

    @Autowired
    private ICountryDao countryDao;

    CountryConverter countryConverter= new CountryConverter();

    @Override
    public CountryDto saveNewCountry(CountrySaveRequestDto countrySaveRequestDto)
    {
        Country country = countryConverter.saveReqConvertToCountry(countrySaveRequestDto);
        country = countryDao.save(country);
        CountryDto countryDto = countryConverter.convertToCountryDto(country);
        return countryDto;
    }

    @Override
    public List<CountryDto> findByCountryCode(String countryCode)
    {
        List<Country> countryList = countryDao.findByCountryCode(countryCode);
        List<CountryDto> countryDtoList = countryConverter.convertToCountryDtoList(countryList);

        return countryDtoList;
    }



}
