package com.example.weatherRapidApi.model;

import com.example.weatherRapidApi.dto.Condition;
import com.example.weatherRapidApi.dto.Current;
import com.example.weatherRapidApi.dto.Location;
import com.example.weatherRapidApi.dto.WeatherData;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.text.ParseException;
import java.time.Instant;
import java.util.Date;

import static org.junit.Assert.*;

public class WeatherFactoryUnitTest {

    private WeatherFactory weatherFactory = new WeatherFactory();
    @Test
    public void shouldCreateWeather_whenCreate_givenWeatherData() throws ParseException {
//        given
        WeatherData weatherData =
                new WeatherData(
                new Location("Minsk", "2021-08-22 03:00"),
                new Current(22D,
                        new Condition("Heavy snow"), 21D, 19D,18D));

        Weather expected = new Weather(0, 22D, 21D, 19D, 18D, "Heavy snow", "Minsk", Date.from(Instant.parse("2021-08-22T00:00:00.000Z")));
//        when
        Weather actual = weatherFactory.create(weatherData);
//        then
        Assertions.assertThat(actual).usingRecursiveComparison()
                .isEqualTo(expected);

    }
}