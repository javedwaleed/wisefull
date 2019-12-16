package org.wisefull.Pages;

import org.openqa.selenium.By;
import org.wisefull.Base.PageBase;
import org.wisefull.Utils.ConfigReader;

public class HomePage extends PageBase {
    private static By aboutUs=By.xpath("//*[@id=\"nav-menu-item-4506\"]/a/span/span");
    private static By aboutUsTitle=By.className("eltdf-title-inner");


    @Override
    public void goToPage() {
        seleniumUtil.goTo(ConfigReader.getProperty("HomeUrl"));
        seleniumUtil.AssertLink(ConfigReader.getProperty("HomeUrl"));
    }


    public void AboutUsLink() throws InterruptedException {
        goToPage();
        seleniumUtil.click(aboutUs);
        seleniumUtil.waitForVisibility(aboutUsTitle);
        seleniumUtil.AssertLink(ConfigReader.getProperty("aboutUsUrl"));

    }

}

