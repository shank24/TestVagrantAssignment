package com.weather.testvagrant.phase1.pages.result;

import com.weather.testvagrant.phase1.pages.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The purpose of this class is to create,
 * locator specific to this page.
 */
public class WeatherResultStat extends AbstractComponent {

    @FindBy(xpath = "//div[contains(text(),'Ahmedabad')]")
    private WebElement cityLink;

    @FindBy(xpath = "//b[contains(text(),'Temp in Degrees:')]")
    private WebElement tempValues;

    @FindBy(xpath ="//b[contains(text(),'Humidity: ')]")
    private WebElement humidValues;

    public WeatherResultStat (final WebDriver driver){
        super(driver);
    }

    public void clickOnCity(){
        this.cityLink.click();
    }

    public String getTemperatureInfo(){
        this.tempValues.isDisplayed();
        return this.tempValues.getText();
    }


    public String getHumidityInfo(){
        this.humidValues.isDisplayed();
        return this.humidValues.getText();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> cityLink.isDisplayed());
    }
}
