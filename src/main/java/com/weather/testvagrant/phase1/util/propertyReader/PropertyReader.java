package com.weather.testvagrant.phase1.util.propertyReader;

import com.weather.testvagrant.assignment.phase1.util.resourceHelper.ResourceHelper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * This class is creating for configuration purpose.
 */
public class PropertyReader implements ConfigReader {

    public static Properties prop;
    private static FileInputStream file;

    public PropertyReader ( ) {

        try {

            // For WebService
            String filePathWebService = ResourceHelper.getResourcePath ( "/src/main/resources/configFiles/config.properties" );
            file = new FileInputStream ( new File( filePathWebService ) );

            prop = new Properties ( );
            prop.load ( file );
        }
        catch (Exception e) {
            e.printStackTrace ( );
        }
    }


    @Override
    public Integer getTemperatureVariance() {
        return Integer.valueOf(prop.getProperty("temperatureVariance"));
    }

    @Override
    public Integer getHumidityVariance() {
        return Integer.valueOf(prop.getProperty("humidityVariance"));

    }
}
