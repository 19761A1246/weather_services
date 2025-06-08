package com.example.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class WeatherService {

    private WebClient webClient;

    @Value("${api_key}")
    private String apiKey;

    String baseUrl ="http://api.openweathermap.org/data/2.5/weather?q=";

    @Autowired
    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    public Mono<String> getWeather(String city)
    {
        String url=baseUrl+city+"&appid="+apiKey;
        log.info("Inside WeatherService class")
        return webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(String.class);

    }
}
