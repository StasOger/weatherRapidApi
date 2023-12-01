package com.example.weatherRapidApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONPropertyIgnore;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String name;

    @JsonProperty("tz_id")
    private String tzId;

    public String getTzId() {
        return tzId;
    }

    public void setTzId(String tzId) {
        this.tzId = tzId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location(String name, String tzId) {
        this.name = name;
        this.tzId = tzId;
    }



    public Location() {
    }
}
