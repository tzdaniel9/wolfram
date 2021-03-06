package com.qa.testcases;

import com.TestBase.TestBase;
import com.qa.pages.AppsPage;
import com.qa.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppsPageTest extends TestBase {

    AppsPage appsPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        initialization();
        appsPage = new AppsPage();
        homePage = new HomePage();
    }

    @Test
    public void WebAppsPageTitleTest() {
        String title = appsPage.validateWebAppsPageTitle();
        Assert.assertEquals(title, "Wolfram|Alpha: Computational Intelligence");
    }

    @Test
    public void MobileAppsTitleTest() {
        String title = appsPage.validateMobileAppsPageTitle();
        Assert.assertEquals(title, "Wolfram|Alpha: Computational Intelligence");
    }

    @Test
    public void WebAppTestLogo() {
    }

    @Test
    public void MobileAppNavTest() {
        appsPage.clickOnAppsLink();
        appsPage.clickOnMobileApps();
        appsPage.goToAndroidLink();
        appsPage.goToMarket();
    }
}

