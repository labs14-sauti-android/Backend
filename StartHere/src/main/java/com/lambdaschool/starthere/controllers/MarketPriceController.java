package com.lambdaschool.starthere.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.lambdaschool.starthere.models.MarketPrice;
import com.lambdaschool.starthere.services.MarketPricesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MarketPriceController {

        @Autowired
        private MarketPricesServiceImpl service;
        @Autowired
        private ObjectMapper mapper;

        @RequestMapping(method = RequestMethod.GET)
        public String findAll(Model model) {
            model.addAttribute("marketprices", service.findAll());
            model.addAttribute("newMarketPrice", new MarketPrice());
            return "marketprices";
        }
}
