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
    private List<MarketPriceCountry> markets;
    private String product_agg;
    private String product_cat;
    private String product;
    private long wholesale;
    private long retail;
    private String currency;
    private String updateDate;



    public MarketPrice() {
    }


    public MarketPrice(List<MarketPriceCountry> markets, String product_agg, String product_cat, String product, long wholesale, long retail, String currency, String updateDate) {
        this.markets = markets;
        this.product_agg = product_agg;
        this.product_cat = product_cat;
        this.product = product;
        this.wholesale = wholesale;
        this.retail = retail;
        this.currency = currency;
        this.updateDate = updateDate;
    }

    public void addMarketPriceCountry(MarketPriceCountry marketPriceCountry) {this.markets.add(marketPriceCountry);}
    
    public void addMarketPriceMarket(MarketPriceCountry market) {this.markets.add(market);}

    public Long getMarketpriceid() {
        return marketpriceid;
    }

    public List<MarketPriceCountry> getMarketPriceCountries() {
        return countries;
    }

    public List<MarketPriceCountry> getMartkets() {
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
