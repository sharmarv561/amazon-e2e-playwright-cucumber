package com.amazon.base;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks {
    @Before
    public void setUp() {
        DriverFactory.initDriver(browser);
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
