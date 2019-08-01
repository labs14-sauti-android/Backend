package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.MarketPrice;
import com.lambdaschool.starthere.models.Role;
import com.lambdaschool.starthere.repository.MarketPriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketPricesServiceImpl {

    @Value("${resource.mprices}")
    private String resource;
    @Value("${resource.mprices}/{id}")
    private String idResource;
    @Autowired
    private RestTemplate restTemplate;

    public List<MarketPrice> findAll() {
        return Arrays.stream(restTemplate.getForObject(resource, MarketPrice[].class)).collect(Collectors.toList());
    }

    @Transactional
    @Override
    public MarketPrice save(MarketPrice marketPrice)
    {
        return (MarketPrice) MarketPriceRepository.save(marketPrice);
    }

}
