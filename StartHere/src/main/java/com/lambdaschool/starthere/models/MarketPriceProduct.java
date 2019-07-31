package com.lambdaschool.starthere.models;

import javax.persistence.*;
import java.util.zip.Adler32;

@Entity
@Table(name = "products")
public class MarketPriceProduct extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productid;

    @Column(nullable = false,
            unique = true)
    private String name;
}
