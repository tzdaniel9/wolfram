package com.qa.util;

import com.TestBase.TestBase;

public class TestUtil extends TestBase {

    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 10;

    public void switchToFrame() {
        driver.switchTo().frame("");
    }
}
