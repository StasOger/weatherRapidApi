package com.example.weatherRapidApi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ForrecastLocation {
    private Location location;

    public ForrecastLocation(Location location) {
        this.location = location;
    }

    public ForrecastLocation() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "ForrecastLocation{" +
                "location=" + location +
                '}';
    }
}
