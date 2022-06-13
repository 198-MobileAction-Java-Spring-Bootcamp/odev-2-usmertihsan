package com.usmertihsan.Homework2.Address.converter;

import com.usmertihsan.Homework2.Address.dto.AddressDto;
import com.usmertihsan.Homework2.Address.dto.AddressSaveRequestDto;
import com.usmertihsan.Homework2.Address.entity.Address;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.dto.CountrySaveRequestDto;
import com.usmertihsan.Homework2.Country.entity.Country;

import java.util.ArrayList;
import java.util.List;

public class AddressConverter {

    public Address saveReqConvertToAddress(AddressSaveRequestDto addressSaveRequestDto){
        Address address = new Address();
        address.setAddressName(addressSaveRequestDto.getAddressName());
        address.setStreet(addressSaveRequestDto.getStreet());
        return address;
    }

    public Address convertToAddress(AddressDto addressDto){
        Address address = new Address();
        address.setAddressName(addressDto.getAddressName());
        address.setStreet(addressDto.getStreet());
        return address;
    }

    public AddressDto convertToAddressDto(Address address){
        AddressDto addressDto = new AddressDto();
        addressDto.setAddressName(address.getAddressName());
        addressDto.setStreet(address.getStreet());
        return addressDto;
    }

    public List<AddressDto> convertToAddressDtoList(List<Address> addressList){
        List<AddressDto> addressDtoList = new ArrayList<>();
        for (Address address : addressList) {
            AddressDto addressDto = convertToAddressDto(address);
            addressDtoList.add(addressDto);
        }
        return addressDtoList;
    }
}
