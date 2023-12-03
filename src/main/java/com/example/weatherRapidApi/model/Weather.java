package com.example.weatherRapidApi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="weather")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
//    @Column(nullable = false)
    private Integer id;

    @Column(name="tempc")
    private Double tempc;

    @Column(name="maxwindmph")
    private double maxWindMph;

    @Column(name="pressuremb")
    private double pressureMb;

    @Column(name="humidity")
    private double humidity;


    @Column(name="conditiontype")
    private String condition;

    @Column(name="locationname")
    private String location;

    @Column(name="date")
    private Date date;

    public Weather(Integer id, Double tempc, double maxWindMph, double pressureMb, double humidity, String condition, String location, Date date) {
        this.id = id;
        this.tempc = tempc;
        this.maxWindMph = maxWindMph;
        this.pressureMb = pressureMb;
        this.humidity = humidity;
        this.condition = condition;
        this.location = location;
        this.date = date;
    }

    public Weather() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTempc() {
        return tempc;
    }

    public void setTempc(Double tempc) {
        this.tempc = tempc;
    }

    public double getMaxWindMph() {
        return maxWindMph;
    }

    public void setMaxWindMph(double maxWindMph) {
        this.maxWindMph = maxWindMph;
    }

    public double getPressureMb() {
        return pressureMb;
    }

    public void setPressureMb(double pressureMb) {
        this.pressureMb = pressureMb;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", tempc=" + tempc +
                ", maxWindMph=" + maxWindMph +
                ", pressureMb=" + pressureMb +
                ", humidity=" + humidity +
                ", condition='" + condition + '\'' +
                ", location='" + location + '\'' +
                ", date=" + date +
                '}';
    }
}
