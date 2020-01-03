package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class SignInPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement SignIn;

    @FindBy(name = "j_username")
    WebElement username;

    @FindBy(name = "j_password")
    WebElement password;

    @FindBy(name = "j_staySignedIn")
    WebElement staySignedInBtn;

    @FindBy(id = "sign-in-btn")
    WebElement signInBtn;

    @FindBy(xpath = "//p[@class='no-margin']")
    WebElement forgotPassword;

    @FindBy(xpath = "//a[@id='create-account']")
    WebElement createAccount;

    @FindBy(xpath = "//div[@id='wa-logo']")
    WebElement WALogo;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean validateWALogo() {
        return WALogo.isDisplayed();
    }

//	public HomePage searchBox(String un, String pwd) {
//		username.sendKeys(un);
//		password.sendKeys(pwd);
//		signInBtn.click();
//		
//		return new HomePage();
//	}

    public HomePage SignIn(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        signInBtn.click();

        return new HomePage();
    }


}
