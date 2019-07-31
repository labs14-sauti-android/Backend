package com.lambdaschool.starthere.models;

import javax.persistence.*;


    @Entity
    @Table(name = "country")
    public class MarketPriceCountry extends Auditable{

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long countryid;

        @Column(nullable = false,
                unique = true)
        private String name;
}
