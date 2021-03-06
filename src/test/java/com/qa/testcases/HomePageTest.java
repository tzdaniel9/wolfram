package com.qa.testcases;

import com.TestBase.TestBase;
import com.qa.pages.*;
import com.qa.util.TestUtil;
import com.sun.xml.internal.bind.v2.TODO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePageTest extends TestBase {
    SignInPage signInPage;
    HomePage homePage;
    TestUtil testUtil;
    AppsPage appsPage;
    TourPage tourPage;
    CreateIDPage createIDPage;
    UpgradeToProPage upgradeToProPage;


    public HomePageTest() {
        super();
    }

    //test cases should be separated -- independent with each other
    //before each test case -- launch the browser and login
    //@test -- execute test case
    //after each test case -- close the browser

    @BeforeMethod
    public void setUp() {
        initialization();
        testUtil = new TestUtil();
        signInPage = new SignInPage();
        homePage = new HomePage();
        tourPage = new TourPage();
        appsPage = new AppsPage();
        Actions action = new Actions(driver);
    }


    @Test
    public void verifyHomePageTitleTest() {
        String homePageTitle = homePage.verifyHomePageTitle();
        Assert.assertEquals(homePageTitle, "Wolfram|Alpha: Computational Intelligence");
    }

//		@Test
//		public boolean validateHomePageLogo(){
//			return WolframAlphaLogo;
//		}

    @Test
    public void TypeInSearchBox() {
//        driver.findElement(By.xpath("//input[@placeholder='Enter what you want to calculate or know about']")).sendKeys("2 + 2");
        homePage.goToSearchBox();
//        driver.findElement(By.xpath("//button[@class='_2HkkNXzH _1caL4O8E _3nvo6gir']//*[@class='_3YyOB_vi']")).click();
        homePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.className("_3k-JE4Gq"));
        target.click();
        action.moveToElement(target).build().perform();
        homePage.clickPlainText();
        driver.findElement(By.xpath("//section[@class='_1jPLqSjg']//section[1]//div[2]")).click();

        homePage.clickContinueInComputableNotebookLink();
        //TODO  //The below code is commented because it shows that i dont have permission to proceed to the
        // notebooks i need to have  a pro account

//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        homePage.clickNoteBookBtn1();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        homePage.clickNoteBookBtn2();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
////        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
//        homePage.goToHelpNotebook();
////        driver.findElement(By.xpath("//a[contains(text(),'Documentation')]")).click();
//        homePage.goToDocumentation();
////        driver.findElement(By.xpath("//a[@innertext='Strings & Text']")).click();
//        homePage.goToStringAndText();
////        driver.findElement(By.xpath("//a[@innertext='String Manipulation'][2]")).click();
//        homePage.goToStringManipulation();
////        driver.findElement(By.xpath("//a[@innertext='String Patterns ']")).click();
//        homePage.goToStringPatterns();


    }

    @Test
    public void Examples() {
        homePage.goToExamples();
        homePage.goToSocietyAndCulture();
        homePage.goToPeople();
        homePage.goToMarvinGayeLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.className("_3k-JE4Gq"));
        target.click();
        action.moveToElement(target).build().perform();
        homePage.goToEnlarge();

    }


    @Test
    public void ExtendedKeyboardTest() {
        homePage.goToExtendedKeyboard();
        driver.findElement(By.xpath("//button[@value='√']")).click();
//        homePage.goToSqrtFn();
        driver.findElement(By.xpath("//input[@placeholder='Enter what you want to calculate or know about']")).sendKeys("25");
        homePage.clickSearchButton();
        homePage.goToShowTrigonometricForm();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
	

