package org.wisefull.Pages;

import org.openqa.selenium.By;
import org.wisefull.Base.PageBase;
import org.wisefull.Utils.ConfigReader;

public class HomePage extends PageBase {
    private static By aboutUs=By.xpath("//*[@id=\"nav-menu-item-4506\"]/a/span/span");


    @Override
    public void goToPage() {
        seleniumUtil.goTo(ConfigReader.getProperty("HomeUrl"));
        seleniumUtil.AssertLink(ConfigReader.getProperty("HomeUrl"));
    }


    public void AboutUsLink() throws InterruptedException {
        goToPage();
        seleniumUtil.waitForVisibility(aboutUs);
        seleniumUtil.click(aboutUs);
        Thread.sleep(5000);
        seleniumUtil.AssertLink(ConfigReader.getProperty("aboutUsUrl"));


    }


}

