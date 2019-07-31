package com.lambdaschool.starthere.resolvers;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.lambdaschool.starthere.services.MarketPriceService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Query implements GraphQLQueryResolver {

    private final MarketPriceService marketPriceService;

    public Query(MarketPriceService marketPriceService) {
        this.marketPriceService = marketPriceService;

        public List<MarketPriceCountry> allMarketPriceCountries() {
            return marketService.findAll()
        }
        allMarketPriceMarkets: {MarketPriceMarket]
            allMarketPriceCurrencies: [MarketPriceCurrency]
            allMarketPriceProductCats: [MarketPriceProductCat]
            allMarketPrices: [MarketPrice]
    }
}
