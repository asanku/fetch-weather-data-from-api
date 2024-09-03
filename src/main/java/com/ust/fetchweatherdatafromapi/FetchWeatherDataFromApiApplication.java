package com.ust.fetchweatherdatafromapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FetchWeatherDataFromApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(FetchWeatherDataFromApiApplication.class, args);
    }

}

//postman url http://localhost:8080/api/v1.0/weather/search?stationName=aeropuertopalma&period=lastdata