package com.weather.testvagrant.phase3.variance;


import com.weather.testvagrant.phase1.util.propertyReader.ObjectReader;
import com.weather.testvagrant.phase3.exception.MatcherException;
import com.weather.testvagrant.phase2.pojo.Weather;


/**
 * This class is serving the purpose for calculating the
 * Variance Logic.
 */
public class WeatherVarianceOperation {

    public static boolean compareWeather(Weather weather1, Weather weather2) throws MatcherException {


        boolean isTempInRange = Math.abs(weather1.getTemperature()-weather2.getTemperature())<= ObjectReader.reader.getTemperatureVariance();
        boolean isHumidInRange = Math.abs(weather1.getHumidity()-weather2.getHumidity())<=ObjectReader.reader.getHumidityVariance();

        boolean isWeatherInRange = (isTempInRange && isHumidInRange);
        if(!isWeatherInRange){
            throw new MatcherException("Weather Values is out of Specified Range");
        }
        return isWeatherInRange;
    }





}
