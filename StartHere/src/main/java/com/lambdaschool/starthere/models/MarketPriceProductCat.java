package com.lambdaschool.starthere.models;


import javax.persistence.*;

@Entity
@Table(name = "productcats")
public class MarketPriceProductCat extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productid;

    @Column(nullable = false,
            unique = true)
    private String name;
}
