package com.lambdaschool.starthere.repository;

import com.lambdaschool.starthere.models.MarketPrice;
import org.springframework.data.repository.CrudRepository;

public interface MarketPriceRepository extends CrudRepository<MarketPrice, Long> {

    MarketPrice findAll(String marketPrice);
}
