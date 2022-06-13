package com.usmertihsan.Homework2.Country.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Entity
@Table(name="COUNTRY")
@Getter
@Setter
public class Country {

    @Id
    @SequenceGenerator(name="Country", sequenceName = "COUNTRY_ID_SEQ")
    @GeneratedValue(generator = "Country")
    private Long countryId;

    @Column(name="COUNTRY_NAME")
    private String countryName;

    @Column(name="COUNTRY_CODE")
    private String countryCode;



}
