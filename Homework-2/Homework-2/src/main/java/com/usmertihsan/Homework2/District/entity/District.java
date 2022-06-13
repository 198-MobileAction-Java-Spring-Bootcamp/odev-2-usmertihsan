package com.usmertihsan.Homework2.District.entity;

import com.usmertihsan.Homework2.City.entity.City;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="DISTRICT")
@Getter
@Setter
public class District {

    @Id
    @SequenceGenerator(name="District", sequenceName = "DISTRICT_ID_SEQ")
    @GeneratedValue(generator = "District")
    private Long districtId;

    @Column(name="DISTRICT_NAME")
    private String districtName;

    @ManyToOne
    @JoinColumn(name="ID_CITY")
    private City city;


}
