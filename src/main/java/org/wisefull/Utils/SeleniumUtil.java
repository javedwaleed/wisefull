package org.wisefull.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumUtil {
    private final long SHORT_EXPLICIT_WAIT_TIME = 20;
    private static String timeStamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());

    public static WebDriver driver() {
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return driver;
    }

    public void sendKeys(By locator, String text) {
        clear(locator);
        driver().findElement(locator).sendKeys(text);
    }
    public void goTo(String url){driver().get(url);}

    public void clear(By locator) {
        driver().findElement(locator).clear();
    }

    public void click(By locator) {
        driver().findElement(locator).click();
    }

    public String getText(By locator) {
        return driver().findElement(locator).getText();
    }

    public boolean isDisplayed(By locator) {
        return driver().findElement(locator).isDisplayed();
    }

    public List<WebElement> findElements(By locator) {
        return driver().findElements(locator);
    }

    public void AssertLink(String url){
        Assert.assertTrue(driver().getCurrentUrl().equalsIgnoreCase(url));
    }

    public void waitForVisibility(By locator) {
        WebDriverWait wait = new WebDriverWait(driver(), SHORT_EXPLICIT_WAIT_TIME);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void takeScreenShot(String methodName) {
        String fileLocation = "src\\ScreenShotsFolder\\S";
        String fileName ="-"+ methodName + " " + timeStamp;
        String fileExtension = ".png";
        File src = ((TakesScreenshot) (driver())).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File(fileLocation + fileName + fileExtension));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
