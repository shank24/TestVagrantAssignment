package com.weather.testvagrant.phase1.util.propertyReader;

/**
 * This interface is for configuring the
 * desired behaviour for passing Temp Variance & Humidity Variance.
 */
public interface ConfigReader {

    Integer getTemperatureVariance();
    Integer getHumidityVariance();
}
