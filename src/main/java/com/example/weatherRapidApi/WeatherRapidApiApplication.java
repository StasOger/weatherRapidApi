package com.example.weatherRapidApi;


import com.example.weatherRapidApi.model.WeatherData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@SpringBootApplication
public class WeatherRapidApiApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
//		SpringApplication.run(WeatherRapidApiApplication.class, args);
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://weatherapi-com.p.rapidapi.com/history.json?q=Minsk&dt=2023-11-29&lang=en"))
				.header("X-RapidAPI-Key", "2b58b0e4a4mshedb529cf1749e26p151970jsn2279bd84e735")
				.header("X-RapidAPI-Host", "weatherapi-com.p.rapidapi.com")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

		System.out.println(response.body());

//		JSONObject obj = new JSONObject(response);
//		JSONArray locationArr = (JSONArray) response.;
//		String info = String.valueOf(obj.getJSONObject("location").getDouble("name"));

		WeatherData weatherData = new ObjectMapper().readValue(response.body(), WeatherData.class);
	}

}
