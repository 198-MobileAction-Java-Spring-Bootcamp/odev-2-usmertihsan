package com.usmertihsan.Homework2.Address.entity;


import com.usmertihsan.Homework2.Street.entity.Street;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ADDRESS")
public class Address
{
    @Id
    @SequenceGenerator(name="Address", sequenceName = "ADDRESS_ID_SEQ")
    @GeneratedValue(generator = "Address")
    private Long addressId;

    @Column(name="ADDRESS_NAME")
    private String addressName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ID_STREET")
    private Street street;

}
