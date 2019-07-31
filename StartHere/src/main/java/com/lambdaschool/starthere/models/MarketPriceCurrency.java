package com.lambdaschool.starthere.models;


import javax.persistence.*;

@Entity
@Table(name = "currencies")
public class MarketPriceCurrency extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long currencyid;

    @Column(nullable = false,
            unique = true)
    private String name;


}
