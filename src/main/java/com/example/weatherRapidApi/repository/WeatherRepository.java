package com.example.weatherRapidApi.repository;

import com.example.weatherRapidApi.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface WeatherRepository extends JpaRepository<Weather, Integer> {

//    @Query("SELECT w FROM Weather w ORDER BY w.date DESC LIMIT 1")
    Weather findFirstByOrderByDateDesc();

    @Query("SELECT AVG(w.tempc) FROM Weather w WHERE w.date BETWEEN ?1 AND ?2")
    Double getAverageTemp(Date from, Date to);

}
