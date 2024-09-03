package com.ust.fetchweatherdatafromapi.service;

import com.ust.fetchweatherdatafromapi.response.SearchByCity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
@RequiredArgsConstructor
public class ApiCallerService {
    private final RestClient restClient;

    //https://api.oceandrivers.com:443/v1.0/getAemetStation/{stationName}/{period}/
    public SearchByCity searchCityByName(String stationName, String period){
        return restClient.get()
                .uri("/getAemetStation/{stationName}/{period}/", stationName, period)
                .retrieve()
                .body(SearchByCity.class);
    }
}
