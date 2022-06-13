package com.usmertihsan.Homework2.Neighborhood.service;


import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.entity.District;
import com.usmertihsan.Homework2.Neighborhood.converter.NeighborhoodConverter;
import com.usmertihsan.Homework2.Neighborhood.dao.INeighborhoodDao;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodDto;
import com.usmertihsan.Homework2.Neighborhood.dto.NeighborhoodSaveRequestDto;
import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NeighborhoodServiceImple implements INeighborhoodService{


    @Autowired
    private INeighborhoodDao neighborhoodDao;

    NeighborhoodConverter neighborhoodConverter = new NeighborhoodConverter();


    @Override
    public NeighborhoodDto saveNewNeighborhood(NeighborhoodSaveRequestDto neighborhoodSaveRequestDto) {

        Neighborhood neighborhood = neighborhoodConverter.saveReqConvertToNeighborhood(neighborhoodSaveRequestDto);
        neighborhood = neighborhoodDao.save(neighborhood);
        NeighborhoodDto neighborhoodDto = neighborhoodConverter.convertToNeighborhoodDto(neighborhood);
        return neighborhoodDto;
    }

    @Override
    public Neighborhood updateNeighborhoodName(String newNeighborhoodName, Long neighborhoodId) {
        Neighborhood neighborhood = neighborhoodDao.findById(neighborhoodId).orElseThrow();
        neighborhood.setNeighborhoodName(newNeighborhoodName);
        neighborhoodDao.save(neighborhood);
        return neighborhood;
    }
}
