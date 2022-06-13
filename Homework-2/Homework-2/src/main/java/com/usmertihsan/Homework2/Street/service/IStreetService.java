package com.usmertihsan.Homework2.Street.service;

import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import com.usmertihsan.Homework2.Street.dto.StreetDto;
import com.usmertihsan.Homework2.Street.dto.StreetSaveRequestDto;
import com.usmertihsan.Homework2.Street.entity.Street;

import java.util.List;

public interface IStreetService {

    StreetDto saveNewStreet(StreetSaveRequestDto streetSaveRequestDto);
    Street updateStreetName(Long id, String newStreetName);



}
