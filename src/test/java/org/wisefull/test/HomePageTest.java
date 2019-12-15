package org.wisefull.test;

import org.testng.annotations.Test;
import org.wisefull.Base.TestBase;
import org.wisefull.Pages.HomePage;

public class HomePageTest extends TestBase {
 HomePage homePage =new HomePage();
    @Test
    public void goToHomePage(){
        homePage.goToPage();
    }

    @Test
    public void goToAboutUs() throws InterruptedException {
        homePage.AboutUsLink();
    }
}
