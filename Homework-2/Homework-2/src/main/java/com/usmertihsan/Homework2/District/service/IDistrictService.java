package com.usmertihsan.Homework2.District.service;

import com.usmertihsan.Homework2.District.dto.DistrictDto;
import com.usmertihsan.Homework2.District.dto.DistrictSaveRequestDto;

public interface IDistrictService {

    DistrictDto saveNewDistrict(DistrictSaveRequestDto districtSaveRequestDto);
}
