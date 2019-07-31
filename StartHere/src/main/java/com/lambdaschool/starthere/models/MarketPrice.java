package com.lambdaschool.starthere.models;

import org.codehaus.jackson.annotate.JsonCreator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "marketprices")
public class MarketPrice extends Auditable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long marketpriceid;
    private List<MarketPriceCountry> countries;
    private List<MarketPriceMarket> markets;
    private String product_agg;
    private String product_cat;
    private String product;
    private long wholesale;
    private long retail;
    private String currency;
    private String updateDate;



    public MarketPrice() {
    }

    @JsonCreator
    public MarketPrice(List<MarketPriceMarket> markets, String product_agg, String product_cat, String product, long wholesale, long retail, String currency, String updateDate) {
        this.markets = markets;
        this.product_agg = product_agg;
        this.product_cat = product_cat;
        this.product = product;
        this.wholesale = wholesale;
        this.retail = retail;
        this.currency = currency;
        this.updateDate = updateDate;
    }

    public void addCountry(MarketPriceCountry country) {this.countries.add(country);}
    
    public void addMarket(MarketPriceMarket market) {this.markets.add(market);}

    public Long getMarketpriceid() {
        return marketpriceid;
    }

    public List<MarketPriceCountry> getCountries() {
        return countries;
    }

    public List<MarketPriceMarket> getMartkets() {
        return markets;
    }

    public String getProduct_agg() {
        return product_agg;
    }

    public String getProduct_cat() {
        return product_cat;
    }

    public String getProduct() {
        return product;
    }

    public long getWholesale() {
        return wholesale;
    }

    public long getRetail() {
        return retail;
    }

    public String getCurrency() {
        return currency;
    }

    public String getUpdateDate() {
        return updateDate;
    }
}
