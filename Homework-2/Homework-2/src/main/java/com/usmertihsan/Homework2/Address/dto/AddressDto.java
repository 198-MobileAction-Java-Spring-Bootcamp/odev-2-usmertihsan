package com.usmertihsan.Homework2.Address.dto;


import com.usmertihsan.Homework2.Street.entity.Street;
import lombok.Data;

@Data
public class AddressDto {

    private Long addressId;
    private String addressName;
    private Street street;

}
