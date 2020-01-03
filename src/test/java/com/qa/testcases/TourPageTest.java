package com.qa.testcases;

import com.TestBase.TestBase;
import com.qa.pages.TourPage;
import com.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TourPageTest extends TestBase {
    TourPage tourPage;
    TestUtil testUtil;


    public TourPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        Actions action = new Actions(driver);
        testUtil = new TestUtil();

    }

    @Test
    public void validateTourPageTitleTest() {
        String tourPageTitle = tourPage.validateTourPageTitle();
        Assert.assertEquals(tourPageTitle, "Wolfram|Alpha Tour");
    }

    @Test
    public void navigatingTourPageTest(){
        driver.findElement(By.xpath("//span[contains(text(),'TOUR')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Units & Measures')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'10 miles + 14 kilometers')]")).click();
        Actions action = new Actions(driver);
        WebElement target = driver.findElement(By.className("_3k-JE4Gq"));
        target.click();
        action.moveToElement(target).build().perform();
        driver.findElement(By.xpath("//span[@class='_3ci9dP6l']//span[contains(text(),'Customize')]")).click();
        driver.findElement(By.xpath("//img[@class='_21yguyzH M1Ub4AKu']")).click();
        driver.findElement(By.xpath("//div[@class='_1KIe0iA7']//div[2]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//div[@class='s_yLOHdH']//div[3]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//div[4]//div[1]//div[1]//button[1]")).click();
        driver.findElement(By.className("JmoJqyKu")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Large')]")).click();
        driver.findElement(By.xpath("//div[6]//div[1]//button[1]")).click();
        driver.findElement(By.xpath("//section[@class='_2o7uE6qp']//li[1]//button[1]")).click();
//        driver.findElement(By.xpath("//button[@class='_2HkkNXzH hH2A4mGu _3CyH4eaX _2rRluSKg']")).click();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
