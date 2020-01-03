package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SignUpPage extends TestBase {

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "firstName")
    WebElement FirstName;

    @FindBy(id = "lastName")
    WebElement LastName;

    @FindBy(id = "password")
    WebElement Password;

    @FindBy(id = "passwordConfirm")
    WebElement ConfirmPassword;

    @FindBy(name = "accountAgreement")
    WebElement agreement;

    @FindBy(id = "create-id-btn")
    WebElement CreateWolframID;

    public SignUpPage() {
        PageFactory.initElements(driver, this);
    }


}
