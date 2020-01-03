package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class CreateIDPage extends TestBase {

    @FindBy(xpath = "//a[@id='create-account']")
    WebElement createAccountLink;

    @FindBy(xpath = "//div[@id='wolfram-logo']")
    WebElement createAccountLogo;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "firstName")
    WebElement firstName;

    @FindBy(id = "lastName")
    WebElement lastName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "passwordConfirm")
    WebElement passwordConfirm;

    @FindBy(id = "create-id-btn")
    WebElement CreateWolframID;

    public CreateIDPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateCreatePageTitle() {
        return driver.getTitle();
    }

    public boolean validateCreateAccountLogo() {
        return createAccountLogo.isDisplayed();
    }

    public void clickCreateOneWolfID() {
        createAccountLink.click();
    }

    public void clickCreateWolframID() {
        CreateWolframID.click();
    }

}
