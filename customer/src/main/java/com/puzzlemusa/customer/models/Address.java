package com.puzzlemusa.customer.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "Address")
public class Address {

    @Id @GeneratedValue(strategy= GenerationType.AUTO) @Column(name = "Id")
    private Long id;
    @Column(name = "StreetName")
    private String streetName;
    @Column(name = "HouseNumber")
    private String houseNumber;
    @Column(name = "PostCode")
    private Long postCode;
}
