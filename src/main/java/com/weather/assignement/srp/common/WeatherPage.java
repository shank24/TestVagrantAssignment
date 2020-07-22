package com.weather.assignement.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherPage extends AbstractComponent {

    @FindBy(className ="notnow")
    private WebElement popUpLink;

    @FindBy(id="h_sub_menu")
    private WebElement threeDotsLink;

    @FindBy(linkText="WEATHER")
    private WebElement weatherLink;

    public WeatherPage(final WebDriver driver){
        super(driver);
    }

    public void routeToWeatherPage(){
        this.popUpLink.click();

        this.threeDotsLink.isDisplayed();
        this.threeDotsLink.click();

        this.weatherLink.isDisplayed();
        this.weatherLink.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((dots -> this.popUpLink.isDisplayed()));
    }
}
