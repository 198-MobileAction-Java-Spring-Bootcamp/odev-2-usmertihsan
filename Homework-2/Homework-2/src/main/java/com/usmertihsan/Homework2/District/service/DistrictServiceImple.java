package com.usmertihsan.Homework2.District.service;
import com.usmertihsan.Homework2.District.converter.DistrictConverter;
import com.usmertihsan.Homework2.District.dao.IDistrictDao;
import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;
import com.usmertihsan.Homework2.District.entity.District;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImple implements IDistrictService{

    @Autowired
    private IDistrictDao districtDao;

    DistrictConverter districtConverter = new DistrictConverter();

    @Override
    public DistrictDto saveNewDistrict(DistrictSaveRequestDto districtSaveRequestDto) {
        District district = districtConverter.saveReqConvertToDistrict(districtSaveRequestDto);
        district = districtDao.save(district);
        DistrictDto districtDto = districtConverter.convertToDistrictDto(district);
        return districtDto;
    }
}
