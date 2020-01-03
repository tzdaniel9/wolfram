package com.qa.pages;

import com.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppsPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'APPS')]")
    WebElement Apps;

    @FindBy(xpath = "//span[@class='_3ci9dP6l']//span[contains(text(),'Web Apps')]")
    WebElement WebApps;

    @FindBy(xpath = "//span[contains(text(),'Problem Generator')]")
    WebElement ProblemGenerator;

    @FindBy(xpath = "//span[@class='_3ci9dP6l']//span[contains(text(),'Mobile Apps')]")
    WebElement MobileApps;

    @FindBy(xpath = "//img[@class='_2aL5yPKz']")
    WebElement WebAppsLogo;

    @FindBy(xpath = "//span[contains(text(),'ALL PRODUCTS »')]")
    WebElement AllProducts;

    public AppsPage() {
        PageFactory.initElements(driver, this);
    }

    public String validateWebAppsPageTitle() {
        return driver.getTitle();
    }

    public boolean WebAppsLogo() {
        return WebAppsLogo.isDisplayed();
    }

    public String validateMobileAppsPageTitle() {
        return driver.getTitle();
    }

    public void clickOnAppsLink() {
        Actions action = new Actions(driver);
        action.moveToElement(Apps).build().perform();
        Apps.click();
    }

    public void clickOnWebApps() {
        WebApps.click();
    }

    public void clickOnMobileApps() {
        MobileApps.click();
    }
}

