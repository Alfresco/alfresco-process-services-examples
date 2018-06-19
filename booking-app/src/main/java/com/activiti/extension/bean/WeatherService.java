package com.activiti.extension.bean;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    private static final Map<String, Weather> weatherMap = new HashMap<>();
    static {
        weatherMap.put("London", new Weather("Sunny", "18 C", "0%", "50%", "9 mph"));
        weatherMap.put("Paris", new Weather("Cloudy", "16 C", "0%", "65%", "8 mph"));
        weatherMap.put("Berlin", new Weather("Mostly Cloudy", "17 C", "0%", "58%", "10 mph"));
        weatherMap.put("New York", new Weather("Cloudy", "19 C", "1%", "79%", "6 mph"));
    }
    
    public Weather getWeatherOfCity(String city) {
        return weatherMap.get(city);
    }
}
