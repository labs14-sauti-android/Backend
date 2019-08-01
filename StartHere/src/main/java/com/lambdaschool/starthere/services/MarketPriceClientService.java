package com.lambdaschool.starthere.services;



import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class MarketPriceClientService {

    private RestTemplate rest = new RestTemplate();
    public static final String SAUTI_MARKETPRICE_BASE = "http://";

    public String getMarketpriceUrl(String String) {
        Gson gson = new Gson();
        String sauti_marketprice = SAUTI_MARKETPRICE_BASE;
        try {
            URI uri = UriComponentsBuilder.fromUriString(sauti_marketprice).build().encode().toUri();
            MultiValueMap<String, String> mvm = new LinkedMultiValueMap<>();
            ResponseEntity<String> res = rest.exchange(uri, HttpMethod.GET, new HttpEntity<>(mvm, null), String.class);

            JsonObject json = gson.fromJson(res.getBody(), JsonObject.class);

            JsonArray data = ((JsonObject) json).getAsJsonArray("data");

            if (data == null || data.size() == 0) {
                return "https://";
            }
        } catch (Throwable e) {
            return "https://media.giphy.com/media/ERXGvbDPhLoWs/giphy.gif";
        }
        return sauti_marketprice;
    }

}
