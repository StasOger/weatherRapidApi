package com.example.weatherRapidApi.dto;

import java.util.Date;

public class Period {

    private String from;
    private String to;

    public Period(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public Period() {
    }

    @Override
    public String toString() {
        return "Period{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}
