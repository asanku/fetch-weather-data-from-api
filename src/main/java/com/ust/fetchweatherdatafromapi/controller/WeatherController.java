package com.ust.fetchweatherdatafromapi.controller;

import com.ust.fetchweatherdatafromapi.response.SearchByCity;
import com.ust.fetchweatherdatafromapi.service.ApiCallerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1.0/weather")
@RequiredArgsConstructor
public class WeatherController {
    private final ApiCallerService apiCallerService;

    //GET /api/v1.0/weather/search?stationName=aeropuertopalma&period=lastdata
    //http://localhost:8080/api/v1.0/weather/search?stationName=aeropuertopalma&period=lastdata
    @GetMapping("/search")
    public ResponseEntity<SearchByCity> searchCityByName(@RequestParam String stationName, @RequestParam String period) {
        return ResponseEntity.ok(apiCallerService.searchCityByName(stationName, period));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.badRequest().body(ex.getMessage());
    }

}
