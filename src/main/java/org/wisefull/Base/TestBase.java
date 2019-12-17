package org.wisefull.Base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.wisefull.Utils.Driver;

public abstract class TestBase extends Base {
    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {

        Driver.setUpDriver();
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod() {
        Driver.getDriver();
    }


    @AfterMethod(alwaysRun = true)
    public void screenshotOnTestFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            System.out.println("***** Error " + result.getName() + " test has failed *****");
            String methodName = result.getName().trim();
            seleniumUtil.takeScreenShot(methodName);

        }
        Driver.closeDriver();
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {

    }
}
