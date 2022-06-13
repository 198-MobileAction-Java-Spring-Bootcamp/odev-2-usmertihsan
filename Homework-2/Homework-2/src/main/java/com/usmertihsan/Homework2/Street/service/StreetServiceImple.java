package com.usmertihsan.Homework2.Street.service;

import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import com.usmertihsan.Homework2.Street.converter.StreetConverter;
import com.usmertihsan.Homework2.Street.dao.IStreetDao;
import com.usmertihsan.Homework2.Street.dto.StreetDto;
import com.usmertihsan.Homework2.Street.dto.StreetSaveRequestDto;
import com.usmertihsan.Homework2.Street.entity.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreetServiceImple implements IStreetService {

    @Autowired
    private  IStreetDao streetDao;

    StreetConverter streetConverter = new StreetConverter();


    @Override
    public StreetDto saveNewStreet(StreetSaveRequestDto streetSaveRequestDto) {
        Street street = streetConverter.saveReqConvertToStreet(streetSaveRequestDto);
        street = streetDao.save(street);
        StreetDto streetDto = streetConverter.convertToStreetDto(street);
        return streetDto;
    }

    @Override
    public Street updateStreetName(Long id, String newStreetName) {
        Street street = streetDao.findById(id).orElseThrow();
        street.setStreetName(newStreetName);
        streetDao.save(street);
        return street;
    }
    }

