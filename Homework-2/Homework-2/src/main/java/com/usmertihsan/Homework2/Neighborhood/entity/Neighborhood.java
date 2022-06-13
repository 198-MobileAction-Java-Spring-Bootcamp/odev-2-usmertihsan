package com.usmertihsan.Homework2.Neighborhood.entity;


import com.usmertihsan.Homework2.District.entity.District;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="NEIGHBORHOOD")
@Getter
@Setter
public class Neighborhood {

    @Id
    @SequenceGenerator(name="Neighborhood", sequenceName = "NEIGHBORHOOD_ID_SEQ")
    @GeneratedValue(generator = "Neighborhood")
    private Long neighborhoodId;

    @Column(name="NEIGHBORHOOD_NAME")
    private String neighborhoodName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_DISTRICT")
    private District district;



}
