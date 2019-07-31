package com.lambdaschool.starthere.services;


import com.lambdaschool.starthere.models.MarketPrice;
import com.lambdaschool.starthere.repository.MarketPriceRepository;
import io.leangen.graphql.annotations.GraphQLQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@GraphQLApi
@Service
public class MarketPriceService {

    private final MarketPriceRepository repository;

    public MarketPriceService(MarketPriceRepository repository) {
        this.repository = repository;
    }

    @GraphQLQuery
    public MarketPrice marketPrice(Long marketpriceid) { return repository.findById(marketpriceid);}

    @GraphQLQuery
    public List<MarketPrice> marketPriceList(String... countries) { return repository.byCountries(countries);}
}
