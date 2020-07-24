package com.weather.testvagrant.phase1.pages.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * This is an interface which has one method,
 * isDisplayed which, checks for element is displayed or not.
 */
public abstract class AbstractComponent {

    protected WebDriverWait wait;

    public AbstractComponent(final WebDriver driver){
        this.wait=new WebDriverWait(driver, 10);
        PageFactory.initElements(driver,this);
    }

    public abstract boolean isDisplayed();
}
