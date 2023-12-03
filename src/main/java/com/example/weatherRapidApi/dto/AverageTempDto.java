package com.example.weatherRapidApi.dto;

public class AverageTempDto {

    private Double averageTemp;

    public AverageTempDto(Double averageTemp) {
        this.averageTemp = averageTemp;
    }

    public Double getAverageTemp() {
        return averageTemp;
    }

    @Override
    public String toString() {
        return "AverageTempDto{" +
                "averageTemp=" + averageTemp +
                '}';
    }
}
