package com.puzzlemusa.customer.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Customer")
public class Customer {

    @Id @GeneratedValue(strategy= GenerationType.AUTO) @Column(name = "Id")
    private Long id;
    @Column(name = "Name")
    private String name;
    @Column(name = "DateOfBirth")
    private Date dateOfBirth;
    @ManyToMany(cascade = CascadeType.ALL) @Column(name = "Addresses")
    private List<Address> addresses = new ArrayList<>();

}
