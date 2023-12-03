package com.example.weatherRapidApi.controllers;

import com.example.weatherRapidApi.dto.AverageTempDto;
import com.example.weatherRapidApi.dto.Period;
import com.example.weatherRapidApi.model.Weather;
import com.example.weatherRapidApi.repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.net.http.HttpResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class WeatherController {

    @Autowired
    private WeatherRepository weatherRepository;

    @GetMapping("/realTimeWeather")
    public ResponseEntity<Weather> realTimeWeather(){
        Weather weather = weatherRepository.findFirstByOrderByDateDesc();
        return new ResponseEntity<>(weather, HttpStatus.OK);
    }

    @PostMapping("/avgTemp")
    public ResponseEntity<AverageTempDto> averageTemp(@RequestBody Period period) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd-MM-yyyy");//     22-08-2021
        Date from= format.parse(period.getFrom());
        Date to= format.parse(period.getTo());
        Double averageTemp = weatherRepository.getAverageTemp(from, to);
        return new ResponseEntity<>(new AverageTempDto(averageTemp), HttpStatus.OK);
    }

}
