package com.usmertihsan.Homework2.Address.service;

import com.usmertihsan.Homework2.Address.dto.AddressDto;
import com.usmertihsan.Homework2.Address.dto.AddressSaveRequestDto;
import com.usmertihsan.Homework2.Address.entity.Address;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Street.dto.StreetDto;
import com.usmertihsan.Homework2.Street.dto.StreetSaveRequestDto;
import com.usmertihsan.Homework2.Street.entity.Street;

import java.util.List;

public interface IAddressService {

    AddressDto saveNewAddress(AddressSaveRequestDto addressSaveRequestDto);
    void deleteAddress(Long id);
    List<AddressDto> findByAddressId(Long addressId);

}
