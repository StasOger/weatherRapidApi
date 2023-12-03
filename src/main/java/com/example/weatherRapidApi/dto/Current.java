package com.example.weatherRapidApi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Current {

    @JsonProperty("temp_c")
    private double tempc;

    @JsonProperty("condition")
    private Condition condition;

    @JsonProperty("wind_mph")
    private double windmph;

    @JsonProperty("pressure_mb")
    private double pressuremb;

    @JsonProperty("humidity")
    private double humidity;


    public Current() {
    }

    public Current(double tempc, Condition condition, double windmph, double pressuremb, double humidity) {
        this.tempc = tempc;
        this.condition = condition;
        this.windmph = windmph;
        this.pressuremb = pressuremb;
        this.humidity = humidity;
    }

    public double getWindmph() {
        return windmph;
    }

    public void setWindmph(double windmph) {
        this.windmph = windmph;
    }

    public double getTempc() {
        return tempc;
    }

    public void setTempc(double tempc) {
        this.tempc = tempc;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public double getPressuremb() {
        return pressuremb;
    }

    public void setPressuremb(double pressuremb) {
        this.pressuremb = pressuremb;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
