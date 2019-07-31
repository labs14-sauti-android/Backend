package com.lambdaschool.starthere.services;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.boot.jackson.JsonObjectSerializer;
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
public class RegulatedGoodsService {

    private RestTemplate rest = new RestTemplate();
    public static final String SAUTI_REGULATEDGOODS_BASE = "http://sautiafrica.org/endpoints/api.php?url=v1/regulatedGoods/&type=json";
    public static final String KEY ="";

    public String getRegualtedGoodsUrl(String) {
        Gson gson = new Gson();
        String sauti_regulatedgoods = SAUTI_REGULATEDGOODS_BASE + KEY;
        try {
            URI uri = UriComponentsBuilder.fromUriString(sauti_regulatedgoods).build().encode().toUri();
            MultiValueMap<String, String> mvm = new LinkedMultiValueMap<>();
            ResponseEntity<String> res = rest.exchange(uri, HttpMethod.GET, new HttpEntity<>(mvm, null), String.class);

            JsonObjectSerializer json = gson.fromJson(res.getBody(), JsonObject .class);

            JsonArray data = json.getAsJsonArray("data");
            if (data == null || data.size() == 0) {
                return "http://sautiafrica.org/endpoints/api.php?url=v1/regulatedGoods/&type=json";
            }
        } catch (Throwable e) {
            return "https://media.giphy.com/media/ERXGvbDPhLoWs/giphy.gif"
        }
    }

}
