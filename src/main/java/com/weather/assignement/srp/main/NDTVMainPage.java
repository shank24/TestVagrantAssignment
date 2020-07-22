package com.weather.assignement.srp.main;

import com.weather.assignement.srp.common.FilterCity;
import com.weather.assignement.srp.common.WeatherPage;
import com.weather.assignement.srp.result.WeatherResultStat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NDTVMainPage {

    private WebDriver driver;
    private WeatherPage weatherPage;
    private FilterCity filterCity;
    private WeatherResultStat weatherResultStat;


    public NDTVMainPage(final WebDriver driver){
        this.driver=driver;
        this.weatherPage= PageFactory.initElements(driver,WeatherPage.class);
        this.filterCity=PageFactory.initElements(driver,FilterCity.class);
        this.weatherResultStat = PageFactory.initElements(driver,WeatherResultStat.class);
    }

    public void goTo(){
        this.driver.get("https://www.ndtv.com/");
    }

    public WeatherPage getWeatherPage() {
        return weatherPage;
    }

    public FilterCity getFilterCity(){
        return filterCity;
    }

    public WeatherResultStat getWeatherResultStat(){
        return weatherResultStat;
    }
}
