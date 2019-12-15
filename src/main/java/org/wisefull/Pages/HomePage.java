package org.wisefull.Pages;

import org.testng.annotations.Test;
import org.wisefull.Base.PageBase;
import org.wisefull.Utils.ConfigReader;

public class HomePage extends PageBase {
    @Test
    @Override
    public void goToPage() {
        seleniumUtil.goTo(ConfigReader.getProperty("url"));
    }
}

