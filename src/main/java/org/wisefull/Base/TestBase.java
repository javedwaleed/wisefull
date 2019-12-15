package org.wisefull.Base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.wisefull.Utils.Driver;

public abstract class TestBase extends Base{
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        Driver.setUpDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        Driver.getDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        Driver.closeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

    }
}
