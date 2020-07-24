package com.weather.testvagrant.phase1;

import com.google.common.util.concurrent.Uninterruptibles;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * This is the Base Class for Web,
 * Here we are using boni-garcia library for instantiating the
 * Driver Object.
 */
public class BaseWebClass {

    protected WebDriver driver;

    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
    }

    @AfterTest
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.driver.quit();
    }

}
