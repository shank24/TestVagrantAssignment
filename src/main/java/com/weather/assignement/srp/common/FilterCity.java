package com.weather.assignement.srp.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterCity extends AbstractComponent{

    @FindBy(xpath = "//input[@id='Ahmedabad']")
    private WebElement filterCityChkBox;

    public FilterCity(final WebDriver driver){
        super(driver);
    }

    public void getCity(){
        this.filterCityChkBox.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(( d-> this.filterCityChkBox.isDisplayed()));
    }


}
