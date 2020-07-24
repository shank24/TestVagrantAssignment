package com.weather.testvagrant.phase3;


import com.weather.testvagrant.phase1.pages.main.NDTVMainPage;
import com.weather.testvagrant.phase2.WeatherAPIRunner;
import com.weather.testvagrant.phase3.exception.MatcherException;
import com.weather.testvagrant.phase2.pojo.Weather;
import com.weather.testvagrant.phase1.BaseWebClass;
import com.weather.testvagrant.phase1.util.conversion.NumberUtil;
import com.weather.testvagrant.phase3.variance.WeatherVarianceOperation;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @Author: Shanky Kalra
 * @Date: 24.07.2020
 * @Description: This is the Main Runner Class,
 * which executes all the Scenario's.
 */
public class MainRunnerTest extends BaseWebClass {

    private NDTVMainPage ndtvMainPage;
    private Weather webObject;
    private Weather apiObject;

    /**
     * Initializing the reference of Web Page Main Class
     */
    @BeforeTest
    public void setUpPages(){
        this.ndtvMainPage=new NDTVMainPage(driver);
    }

    /**
     * This method is executing test via UI.
     */
    @Test
    public void validatingPhase1(){


        ndtvMainPage.goTo();
        Assert.assertTrue(ndtvMainPage.getWeatherPage().isDisplayed());

        ndtvMainPage.getWeatherPage().routeToWeatherPage();
        Assert.assertTrue(ndtvMainPage.getFilterCity().isDisplayed());

        ndtvMainPage.getFilterCity().getCity();
        Assert.assertTrue(ndtvMainPage.getWeatherResultStat().isDisplayed());

        ndtvMainPage.getWeatherResultStat().clickOnCity();

        //Retrieving the temperature as a String
        String cityTemperature = ndtvMainPage.getWeatherResultStat().getTemperatureInfo();
        String cityHumidity = ndtvMainPage.getWeatherResultStat().getHumidityInfo();

        Assert.assertTrue(cityTemperature.contains("Temp"));
        Assert.assertTrue(cityHumidity.contains("Humidity"));

        Integer temperatureInNumber  = Integer.valueOf(NumberUtil.extractIntegerValue(cityTemperature));
        Integer humidityInNumber =  Integer.valueOf(NumberUtil.extractIntegerValue(cityHumidity));

        /**
         *   Setting POJO Class for Weather Web Object
         **/
        webObject=new Weather(temperatureInNumber,humidityInNumber);

    }

    /**
     * This method is executing test via API.
     */
    @Test
    public void validatingPhase2(){
        WeatherAPIRunner weatherAPI = new WeatherAPIRunner();
        Response response = weatherAPI.getByCoordinates();
        Integer temperatureJSONValue = response.then().extract().path("main.temp");
        Integer humidityJSONValue = response.then().extract().path("main.humidity");

        Assert.assertNotNull(temperatureJSONValue);
        Assert.assertNotNull(humidityJSONValue);

        /**
         *   Setting POJO Class for Weather API Object
         **/
        apiObject = new Weather(temperatureJSONValue,humidityJSONValue);

    }

    /**
     * This method is validating both test via (WEB & UI).
     */
    @Test
    public void validatingPhase3()  {

        /**
         *   Comparing the result of phase1 with the phase2
         *
         **/

        try {
            boolean result = WeatherVarianceOperation.compareWeather(webObject,apiObject);
            if(result==true){
                System.out.println("Success");
            }
        }
        catch (MatcherException e){
            System.out.println(e.getMessage());
        }

    }





}
