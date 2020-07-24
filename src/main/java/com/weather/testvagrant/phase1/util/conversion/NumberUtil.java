package com.weather.testvagrant.phase1.util.conversion;

/**
 * This class is extracting number from String.
 */
public class NumberUtil {

    public static String extractIntegerValue(String str){
        return str.replaceAll("\\D+","");
    }
}
