package com.usmertihsan.Homework2.Address.service;


import com.usmertihsan.Homework2.Address.converter.AddressConverter;
import com.usmertihsan.Homework2.Address.dao.IAddressDao;
import com.usmertihsan.Homework2.Address.dto.AddressDto;
import com.usmertihsan.Homework2.Address.dto.AddressSaveRequestDto;
import com.usmertihsan.Homework2.Address.entity.Address;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import com.usmertihsan.Homework2.Street.dto.StreetDto;
import com.usmertihsan.Homework2.Street.entity.Street;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImple implements IAddressService{


    @Autowired
    private IAddressDao addressDao;

    AddressConverter addressConverter = new AddressConverter();

    @Override
    public AddressDto saveNewAddress(AddressSaveRequestDto addressSaveRequestDto) {
        Address address = addressConverter.saveReqConvertToAddress(addressSaveRequestDto);
        address = addressDao.save(address);
        AddressDto addressDto = addressConverter.convertToAddressDto(address);
        return addressDto;
    }

    @Override
    public void deleteAddress(Long id) {

        boolean isExist = addressDao.existsById(id);
        if(!isExist){
            throw new RuntimeException("Address does not exist!");
        }
        addressDao.deleteById(id);
    }

    @Override
    public List<AddressDto> findByAddressId(Long addressId)
    {
        List<Address> addressList = addressDao.findByAddressId(addressId);
        List<AddressDto> addressDtoList = addressConverter.convertToAddressDtoList(addressList);

        return addressDtoList;
    }
}
