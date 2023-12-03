package com.example.weatherRapidApi;


import com.example.weatherRapidApi.dto.WeatherData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class WeatherRapidApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherRapidApiApplication.class, args);


	}
}
