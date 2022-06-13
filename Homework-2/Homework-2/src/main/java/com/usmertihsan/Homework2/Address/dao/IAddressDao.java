package com.usmertihsan.Homework2.Address.dao;

import com.usmertihsan.Homework2.Address.dto.AddressDto;
import com.usmertihsan.Homework2.Address.entity.Address;
import com.usmertihsan.Homework2.Country.dto.CountryDto;
import com.usmertihsan.Homework2.Country.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IAddressDao extends JpaRepository<Address,Long> {

    List<Address> findByAddressId(Long addressId);

}
