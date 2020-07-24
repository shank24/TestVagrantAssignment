package com.weather.testvagrant.assignment.phase1.util.resourceHelper;

public class ResourceHelper {
    public static String getResourcePath(String path) {

        String basePath = System.getProperty("user.dir");
        return basePath + path;
    }
}
