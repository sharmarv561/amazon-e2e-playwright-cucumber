package com.amazon.base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import com.amazon.utils.LoggerUtil;
import com.amazon.utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;
    protected ConfigReader config;

    public void setUp() {
        config = new ConfigReader();
        LoggerUtil.initLogger();  // optional logger setup

        String browser = config.getProperty("browser");
        driver = DriverFactory.initDriver(browser);  // Add browser param support if needed
    }

    public void tearDown() {
        DriverFactory.quitDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

//    @Before
//    public void setUpScenario() {
//        setUp(); // calls BaseTest → sets up driver, config, logger
//    }
//
//    @After
//    public void tearDownScenario() {
//        tearDown(); // quits the driver
//    }

}
