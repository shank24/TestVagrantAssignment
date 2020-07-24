package com.weather.testvagrant.phase1.pages.main;

import com.weather.testvagrant.phase1.pages.common.WeatherPage;
import com.weather.testvagrant.phase1.pages.common.FilterCity;
import com.weather.testvagrant.phase1.pages.result.WeatherResultStat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NDTVMainPage {

    /**
     * Creating reference of the pages
     */
    private WebDriver driver;
    private WeatherPage weatherPage;
    private FilterCity filterCity;
    private WeatherResultStat weatherResultStat;



    /**
     * This class is the main page
     * from where all actions are taking place, thus named it
     * NDTVMainPage and in the constructor, initializing all the
     * PageFactory elements.
     */
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
