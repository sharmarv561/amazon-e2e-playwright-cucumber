package com.amazon.base;

import io.cucumber.java.Before;
import io.cucumber.java.After;

public class Hooks extends BaseTest {
    @Before
    public void setUpScenario() {
        setUp();
    }

    @After
    public void tearDownScenario() {
        tearDown();
    }
}
