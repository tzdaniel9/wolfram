package com.qa.testcases;

import com.TestBase.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {
    SignInPage signInPage;
    HomePage homePage;

    public SignInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        signInPage = new SignInPage();
    }

    @Test
    public void signInPageTitleTest() {
        String title = signInPage.validateLoginPageTitle();
        Assert.assertEquals(title, "Sign In - Wolfram|Alpha");
    }

    @Test
    public void waLogo() {
        boolean flag = signInPage.validateWALogo();
        Assert.assertTrue(flag);
    }

    @Test
    public void signInTest() {
        driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
        driver.findElement(By.name("j_username")).sendKeys(prop.getProperty("email"));
        driver.findElement(By.name("j_password")).sendKeys(prop.getProperty("password"));
        driver.findElement(By.id("sign-in-btn")).submit();

//        homePage = signInPage.SignIn(prop.getProperty("username"), prop.getProperty("password"));

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}


