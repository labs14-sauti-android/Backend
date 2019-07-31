package com.lambdaschool.starthere.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lambdaschool.starthere.models.*;
import com.lambdaschool.starthere.services.MarketPriceService;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private MarketPriceService marketPriceService;

    public Query(MarketPriceService marketPriceService) {
        this.marketPriceService = marketPriceService;

        public List<MarketPriceCountry> allMarketPriceCountries() {
            return marketPriceService.findAll();
        }
        public List<MarketPriceMarket> allMarketPriceMarkets() {
            return marketPriceService.findAll();
        }
        public List<MarketPriceProduct> allMarketPriceProducts(){
            return marketPriceService.findAll();
        }

        public List<MarketPriceProductCat> allMarketPriceProductCats(){
            return marketPriceService.findAll();
        }

        public List<MarketPrice> allMarketPrices(){
            return marketPriceService.findAll();
        }

    }
}
