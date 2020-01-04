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

    @FindBy(id = "accountAgreement1")
    WebElement accountAgreement1;

    @FindBy(id = "accountAgreement2")
    WebElement AccountAgreement2;

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

    public void goToCreateAccount(){
        createAccountLink.click();
    }
     public  void goToEmail(String email){
        this.email.sendKeys(prop.getProperty("email"));
     }

    public  void goToFirstName(String firstName){
        this.firstName.sendKeys(prop.getProperty("FirstName"));
    }

    public  void goToLastName(String lastName){
        this.lastName.sendKeys(prop.getProperty("LastName"));
    }

    public  void goToPassword(String password){
        this.password.sendKeys(prop.getProperty("Password"));
    }

    public  void goToPasswordConfirm(String confirmPassword){
        this.passwordConfirm.sendKeys(prop.getProperty("ConfirmPassword"));
    }

    public void goToAccountAgreement(){
        accountAgreement1.click();
    }




}
