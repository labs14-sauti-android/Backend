package com.lambdaschool.starthere.models;


import javax.persistence.*;

@Entity
@Table(name = "markets")
public class MarketPriceMarket extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long marketid;

    @Column(nullable = false,
            unique = true)
    private String name;
}
