package com.usmertihsan.Homework2.City.entity;

import com.usmertihsan.Homework2.Country.entity.Country;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="CITY")
@Getter
@Setter
public class City {

    @Id
    @SequenceGenerator(name="City", sequenceName = "CITY_ID_SEQ")
    @GeneratedValue(generator = "City")
    private Long cityId;

    @Column(name="CITY_NAME")
    private String cityName;

    @Column(name="CITY_PLATE_NO")
    private String cityPlateNo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_COUNTRY")
    private Country country;



}
