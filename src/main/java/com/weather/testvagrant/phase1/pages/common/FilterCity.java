package com.weather.testvagrant.phase1.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * The purpose of this class is to create,
 * locator specific to this page,
 * as per the Single Responsibility Design Pattern.
 */
public class FilterCity extends AbstractComponent {

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
