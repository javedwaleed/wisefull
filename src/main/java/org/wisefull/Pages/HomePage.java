package org.wisefull.Pages;

import org.wisefull.Base.PageBase;
import org.wisefull.Utils.ConfigReader;

public class HomePage extends PageBase {

    public void goToHomePage(){
        seleniumUtil.goTo(ConfigReader.getProperty("url"));
    }

    @Override
    public void waitForPageToLoad() {

    }



    }

