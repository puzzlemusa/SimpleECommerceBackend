package com.puzzlemusa.order.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter @Entity
@Table(name = "CustomerOrder")
public class Order {
    @Id @GeneratedValue(strategy= GenerationType.AUTO) @Column(name = "Id")
    private Long id;
    @Column(name = "CustomerId")
    private Long customerId;
    @Column(name = "OrderState")
    private OrderState orderState;
}
