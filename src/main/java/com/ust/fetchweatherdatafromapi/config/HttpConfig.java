package com.ust.fetchweatherdatafromapi.config;

import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
@Slf4j
public class HttpConfig {


    @Value("${api.base.url}")
    private String BASE_URL;

    @Bean
    public RestClient restClient() { //instead of open feign we are using restclient
        log.info("BASE_URL: {}", BASE_URL);
        return RestClient.create(BASE_URL);
    }
}
