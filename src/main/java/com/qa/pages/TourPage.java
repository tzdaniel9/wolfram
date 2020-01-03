package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class TourPage extends TestBase {

    @FindBy(xpath = "//img[@class='tracking-header-logo']")
    WebElement TourLogo;

    public TourPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateTourPageTitle() {
        return driver.getTitle();
    }

    public boolean validateTourLogo() {
        return TourLogo.isDisplayed();
    }

}
