package com.example.weatherRapidApi.model;

import com.example.weatherRapidApi.dto.Current;
import com.example.weatherRapidApi.dto.WeatherData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class WeatherFactory {

    public Weather create(WeatherData weatherData) throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("yyyy-MM-dd HH:mm");//     2023-12-03 20:14
        Date weatherDate= format.parse(weatherData.getLocation().getDate());
        return new Weather(
                0,
                weatherData.getCurrent().getTempc(),//температура
                weatherData.getCurrent().getWindmph(),//скорость ветра
                weatherData.getCurrent().getPressuremb(),//давление
                weatherData.getCurrent().getHumidity(),//влажность
                weatherData.getCurrent().getCondition().getText(),//погодные условия
                weatherData.getLocation().getTzId(),//локация
                weatherDate);//дата
    }
}




