package com.usmertihsan.Homework2.Street.entity;


import com.usmertihsan.Homework2.Neighborhood.entity.Neighborhood;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="STREET")
@Getter
@Setter

public class Street {

    @Id
    @SequenceGenerator(name="Street", sequenceName = "STREET_ID_SEQ")
    @GeneratedValue(generator = "Street")
    private Long streetId;

    @Column(name="STREET_NAME")
    private String streetName;

    @Column(name="APARTMANT_NUMBER")
    private String apartmantNumber;

    @Column(name="DOOR_NUMBER")
    private String doorNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_NEIGHBORHOOD")
    private Neighborhood neighborhood;


}
