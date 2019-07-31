package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.MarketPrice;
import com.lambdaschool.starthere.models.Role;

import java.util.List;

public interface MarketPricesService {

    List<MarketPrice> findAll();

    MarketPrice findMarketPriceById(long id);


}
