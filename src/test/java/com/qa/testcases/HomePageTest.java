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
        driver.findElement(By.xpath("//input[@placeholder='Enter what you want to calculate or know about']")).sendKeys("2 + 2");
//        homePage.goToSearchBox();
        driver.findElement(By.xpath("//button[@class='_2HkkNXzH _1caL4O8E _3nvo6gir']//*[@class='_3YyOB_vi']")).click();
//        homePage.clickSearchButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.className("_3k-JE4Gq"));
        target.click();
        action.moveToElement(target).build().perform();
        driver.findElement(By.xpath("//span[@class='_3ci9dP6l']//span[contains(text(),'Plain Text')]")).click();
//        homePage.clickPlainText();
        driver.findElement(By.xpath("//section[@class='_1jPLqSjg']//section[1]//div[2]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Continue in computable notebook')]")).click();

      //TODO  //The below code is commented because it shows that i dont have permission to proceed to the
        // notebooks i need to have  a pro account
//        homePage.clickContinueInComputableNotebookLink();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("[data-box-view-id='c79'] ._3V_l-auOpaBwWbhbhpIImO"));
//        driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();
//        driver.findElement(By.xpath("//a[contains(text(),'Documentation')]")).click();
//        driver.findElement(By.xpath("//a[@innertext='Strings & Text']")).click();
//        driver.findElement(By.xpath("//a[@innertext='String Manipulation'][2]")).click();
//        driver.findElement(By.xpath("//a[@innertext='String Patterns ']")).click();


    }

    @Test
    public void Examples() {
//        driver.findElement(By.xpath("//span[contains(text(),'Examples')]")).click();
        homePage.goToExamples();
//        driver.findElement(By.xpath("//a[contains(text(),'Society & Culture')]")).click();
        homePage.goToSocietyAndCulture();
//        driver.findElement(By.xpath("//a[@class='subpage-section-title'][contains(text(),'People')]")).click();
        homePage.goToPeople();
//        driver.findElement(By.linkText("Marvin Gaye")).click();
        homePage.goToMarvinGayeLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
//        WebElement target = driver.findElement(By.xpath("//section[@class='_3k-JE4Gq CYPpWSLM']"));
//        WebElement target = driver.findElement(By.cssSelector(".CYPpWSLM._3k-JE4Gq > ._2yjzGRtP"));
        WebElement target = driver.findElement(By.className("_3k-JE4Gq"));
        target.click();
        action.moveToElement(target).build().perform();
//        driver.findElement(By.xpath("//span[contains(text(),'Enlarge')]")).click();
        homePage.goToEnlarge();

    }


    @Test
    public void ExtendedKeyboardTest() {
        homePage.goToExtendedKeyboard();
        driver.findElement(By.xpath("//button[@value='√']")).click();
//        homePage.goToSqrtFn();
        driver.findElement(By.xpath("//input[@placeholder='Enter what you want to calculate or know about']")).sendKeys("25");
        homePage.clickSearchButton();
//        driver.findElement(By.xpath("//span[contains(text(),'Show trigonometric form')]")).click();
        homePage.goToShowTrigonometricForm();
    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
	

