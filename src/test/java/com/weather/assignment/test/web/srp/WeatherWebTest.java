package com.weather.assignment.test.web.srp;

import com.weather.assignement.srp.main.NDTVMainPage;
import com.weather.assignment.test.web.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WeatherWebTest extends BaseTest {

    private NDTVMainPage ndtvMainPage;

    @BeforeTest
    public void setUpPages(){
        this.ndtvMainPage=new NDTVMainPage(driver);
    }

    @Test
    public void NDTVWeatherWorkflow(){

        ndtvMainPage.goTo();
        Assert.assertTrue(ndtvMainPage.getWeatherPage().isDisplayed());

        ndtvMainPage.getWeatherPage().routeToWeatherPage();
        Assert.assertTrue(ndtvMainPage.getFilterCity().isDisplayed());

        ndtvMainPage.getFilterCity().getCity();
        Assert.assertTrue(ndtvMainPage.getWeatherResultStat().isDisplayed());

        ndtvMainPage.getWeatherResultStat().clickOnCity();

        System.out.println(
                "City :"  + ndtvMainPage.getWeatherResultStat().getCityWeatherInfo()
        );
//b[contains(text(),'Temp in Degrees: 26')]
    }
}
