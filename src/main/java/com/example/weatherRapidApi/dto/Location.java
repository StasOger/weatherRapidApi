package com.example.weatherRapidApi.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyIgnore;

import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    @JsonProperty("tz_id")
    private String tzId;

    @JsonProperty("localtime")
    private String date;

    public Location(String tzId, String date) {
        this.tzId = tzId;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Location() {
    }



    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

}
