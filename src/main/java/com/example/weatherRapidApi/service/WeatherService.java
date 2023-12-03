package com.example.weatherRapidApi.service;

import com.example.weatherRapidApi.dto.WeatherData;
import com.example.weatherRapidApi.model.Weather;
import com.example.weatherRapidApi.model.WeatherFactory;
import com.example.weatherRapidApi.repository.WeatherRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.ParseException;

@Service
@EnableScheduling
public class WeatherService {

    @Autowired
    private WeatherRepository weatherRepository;

    private final WeatherFactory weatherFactory = new WeatherFactory();


    @Scheduled(fixedRate = 60000)
    public void getWeather() throws IOException, InterruptedException, ParseException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherapi-com.p.rapidapi.com/current.json?q=Minsk"))
                .header("X-RapidAPI-Key", "2b58b0e4a4mshedb529cf1749e26p151970jsn2279bd84e735")
                .header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        WeatherData weatherData = new ObjectMapper().readValue(response.body(), WeatherData.class);
        Weather weather = weatherFactory.create(weatherData);

        weatherRepository.save(weather);

    }
}
