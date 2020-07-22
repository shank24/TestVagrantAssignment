package com.weather.assignement.srp.result;

import com.weather.assignement.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WeatherResultStat extends AbstractComponent {

    @FindBy(xpath = "//div[contains(text(),'Ahmedabad')]")
    private WebElement cityLink;

    @FindBy(xpath = "//b[contains(text(),'Temp in Degrees:')]")
    private WebElement tempValues;



    public WeatherResultStat (WebDriver driver){
        super(driver);
    }

    public void clickOnCity(){
        this.cityLink.click();
    }

    public String getCityWeatherInfo(){
        this.tempValues.isDisplayed();
        return this.tempValues.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> cityLink.isDisplayed());
    }
}
