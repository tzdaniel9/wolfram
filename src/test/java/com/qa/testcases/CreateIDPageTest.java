package com.qa.testcases;

import com.TestBase.TestBase;
import com.qa.pages.CreateIDPage;
import com.qa.pages.HomePage;
import com.qa.pages.SignInPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateIDPageTest extends TestBase {
    CreateIDPage createIDPage;
    HomePage homePage;
    SignInPage signInPage;
    SignInPageTest signInPageTest;

    public CreateIDPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        createIDPage = new CreateIDPage();
        homePage = new HomePage();
        signInPage = new SignInPage();
        signInPageTest = new SignInPageTest();
    }

    @Test
    public void createIDPageTitleTest() {
        signInPageTest.signInTest();
        driver.findElement(By.id("create-account")).click();
        String title = createIDPage.validateCreatePageTitle();
        Assert.assertEquals(title, "Create a Wolfram ID - Wolfram|Alpha");
    }

    @Test
    public void CreateWolfID() {
        signInPageTest.signInTest();
        createIDPage.goToCreateAccount();
        createIDPage.goToEmail(prop.getProperty("email"));
        createIDPage.goToFirstName(prop.getProperty("FirstName"));
        createIDPage.goToLastName(prop.getProperty("LastName"));
        createIDPage.goToPassword(prop.getProperty("Password"));
        createIDPage.goToPasswordConfirm(prop.getProperty("ConfirmPassword"));
        createIDPage.goToAccountAgreement();
        createIDPage.clickCreateWolframID();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
