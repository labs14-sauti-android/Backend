package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.MarketPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MarketPricesServiceImpl {

    @Value("${resource.tasks}")
    private String resource;
    @Value("${resource.tasks}/{id}")
    private String idResource;
    @Autowired
    private RestTemplate restTemplate;

    public List<MarketPrice> findAll() {
        return Arrays.stream(restTemplate.getForObject(resource, MarketPrice[].class)).collect(Collectors.toList());
    }

    public MarketPrice create(MarketPrice marketPrice) {
        return restTemplate.postForObject(resource, marketPrice, MarketPrice.class);
    }

}
