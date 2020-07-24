package com.weather.testvagrant.phase2;


import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;


public class WeatherAPIRunner
{

    @Test
    public Response getByCoordinates(){

        Response response = given()
                .accept(JSON)
                .queryParams(getParams())
                .log()
                .all()
                .when()
                .get("https://api.openweathermap.org/data/2.5/weather")
                .then()
                .log()
                .all()
                .statusCode(200)
                .contentType(JSON)
                .extract()
                .response();

        return response;

    }

    public static Map<String, String> getParams() {
        Map<String, String> getParamsObject = new HashMap<String, String>();//
        getParamsObject.put("lat", "23.0199968");
        getParamsObject.put("lon", "72.2995501");
        getParamsObject.put("units","metric");
        getParamsObject.put("appid","7fe67bf08c80ded756e598d6f8fedaea");
        return getParamsObject;
    }



}
