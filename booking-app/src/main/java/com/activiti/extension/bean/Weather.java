package com.activiti.extension.bean;

public class Weather {

    private String status;
    private String temperature;
    private String humidity;
    private String precipitation;
    private String wind;
    
    public Weather(String status, String temperature, 
            String precipitation, String humidity, String wind) {
        this.status = status;
        this.temperature = temperature;
        this.humidity = humidity;
        this.precipitation = precipitation;
        this.wind = wind;
    }
    
    public String getStatus() {
        return status;
    }
    
    public String getTemperature() {
        return temperature;
    }
    
    public String getPrecipitation() {
        return precipitation;
    }
    
    public String getHumidity() {
        return humidity;
    }
    
    public String getWind() {
        return wind;
    }
}
