package com.weather.testvagrant.phase2.pojo;

/**
 * This is the POJO class of Weather.
 */
public class Weather {

    private Integer humidity;
    private Integer temperature;

    public Weather(Integer temperature, Integer humidity ){
        this.temperature=temperature;
        this.humidity=humidity;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

}
