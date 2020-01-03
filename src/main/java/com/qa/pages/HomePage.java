package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class HomePage extends TestBase {

    TourPage tourPage;

    @FindBy(xpath = "//img[@class='_14AAHBvR']")
    WebElement WolframAlphaLogo;

    @FindBy(xpath = "//input[@placeholder='Enter what you want to calculate or know about']")
    @CacheLookup
    WebElement searchBox;

    @FindBy(xpath = "//span[contains(text(),'Extended Keyboard')]")
    WebElement ExtendedKeyboard;

    @FindBy(xpath = "//span[contains(text(),'Upload')]")
    WebElement upload;

    @FindBy(xpath = "//span[contains(text(),'Examples')]")
    WebElement examples;

    @FindBy(xpath = "//span[contains(text(),'Random')]")
    WebElement random;

    //    @FindBy(css = ".BkQEt310 ._1dWwKJEb:nth-of-type(1) [fill]")
    @FindBy(xpath = "//button[@class='_2HkkNXzH _1caL4O8E _3nvo6gir']//*[@class='_3YyOB_vi']")
    WebElement searchButton;

    @FindBy(xpath = "//section[@class='_3k-JE4Gq CYPpWSLM']")
    WebElement inputArea;

    @FindBy(xpath = "//span[@class='_3ci9dP6l']//span[contains(text(),'Plain Text')]")
    WebElement plainText;

    @FindBy(xpath = "//span[contains(text(),'Continue in computable notebook »')]")
    WebElement ContinueInComputableNotebookLink;

    @FindBy(css = "[xpath]")
    WebElement GraphicsBoxHolder;


    @FindBy(xpath = "//span[contains(text(),'Mathematics')]")
    WebElement Mathematics;

    @FindBy(xpath = "//span[contains(text(),'Step-by-Step Solutions')]")
    WebElement StepByStepSolutions;

    @FindBy(linkText = "Elementary Math")
    WebElement ElementaryMath;

    @FindBy(linkText = "Algebra")
    WebElement Algebra;

    @FindBy(xpath = "//span[contains(text(),'Plotting & Graphics')]")
    WebElement PlottingAndGraphics;

    @FindBy(linkText = "Calculus & Analysis")
    WebElement CalculusAndAnalysis;

    @FindBy(linkText = "Geometry")
    WebElement Geometry;

    @FindBy(xpath = "//span[contains(text(),'Differential Equations')]")
    WebElement DifferentialEquations;

    @FindBy(linkText = "Statistics")
    WebElement Statistics;

    @FindBy(xpath = "//a[@class='_2HkkNXzH _1OeZ-d0Z Vpqj2Hhw']")
    WebElement MoreTopicsMathematics;


    @FindBy(xpath = "//span[contains(text(),'Science & Technology')]")
    WebElement ScienceAndTechnology;

    @FindBy(xpath = "//span[contains(text(),'Units & Measures')]")
    WebElement UnitsAndMeasures;

    @FindBy(xpath = "//span[contains(text(),'Physics')]")
    WebElement Physics;

    @FindBy(xpath = "//span[contains(text(),'Chemistry')]")
    WebElement Chemistry;

    @FindBy(xpath = "//span[contains(text(),'Engineering')]")
    WebElement Engineering;

    @FindBy(xpath = "//span[contains(text(),'Computational Sciences')]")
    WebElement ComputationalSciences;

    @FindBy(xpath = "//span[contains(text(),'Earth Sciences')]")
    WebElement EarthSciences;

    @FindBy(xpath = "//span[contains(text(),'Materials')]")
    WebElement Materials;

    @FindBy(xpath = "//span[contains(text(),'Transportation')]")
    WebElement Transportation;

    @FindBy(xpath = "//a[@class='_2HkkNXzH _26NyJ6uF Vpqj2Hhw']//span[contains(text(),'More Topics')]")
    WebElement MoreTopicsScienceAndTechnology;


    @FindBy(xpath = "//a[contains(text(),'Society & Culture')]")
    WebElement SocietyAndCulture;

    @FindBy(linkText = "People")
    WebElement People;

    @FindBy(xpath = "//span[contains(text(),'Arts & Media')]")
    WebElement ArtsAndMedia;

    @FindBy(linkText = "Dates & Times")
    WebElement DatesAndTimes;

    @FindBy(xpath = "Words & Linguistics")
    WebElement WordsAndLinguistics;

    @FindBy(xpath = "//span[contains(text(),'Money & Finance')]")
    WebElement MoneyAndFinance;

    @FindBy(xpath = "//span[contains(text(),'Food & Nutrition')]")
    WebElement FoodAndNutrition;

    @FindBy(xpath = "//span[contains(text(),'Political Geography')]")
    WebElement PoliticalGeography;

    @FindBy(linkText = "History")
    WebElement History;

    @FindBy(xpath = "//a[@class='_2HkkNXzH _1sNCeANa Vpqj2Hhw']//span[contains(text(),'More Topics')]")
    WebElement MoreTopicsSocietyAndCulture;


    @FindBy(xpath = "//span[contains(text(),'Everyday Life')]")
    WebElement EverydayLife;

    @FindBy(xpath = "//span[contains(text(),'Personal Health')]")
    WebElement PersonalHealth;

    @FindBy(xpath = "//span[contains(text(),'Personal Finance')]")
    WebElement PersonalFinance;

    @FindBy(xpath = "//span[contains(text(),'Surprises')]")
    WebElement Surprises;

    @FindBy(xpath = "//span[contains(text(),'Entertainment')]")
    WebElement Entertainment;

    @FindBy(xpath = "//span[contains(text(),'Household Science')]")
    WebElement HouseholdScience;

    @FindBy(xpath = "//span[contains(text(),'Household Math')]")
    WebElement HouseholdMath;

    @FindBy(linkText = "Hobbies")
    WebElement Hobbies;

    @FindBy(xpath = "//span[contains(text(),'Today's World')]")
    WebElement TodaysWorld;

    @FindBy(xpath = "//a[@class='_2HkkNXzH QpC93TDl Vpqj2Hhw']//span[contains(text(),'More Topics')]")
    WebElement MoreTopicsEverydayLife;

    @FindBy(xpath = "//input[@placeholder='Enter what you want to calculate or know about']")
    WebElement InputBox;

    @FindBy(xpath = "//span[contains(text(),'Web Apps')]")
    WebElement webApps;

    @FindBy(xpath = "//img[@class='s4Fy6euy']")
    WebElement toTourPage;

    @FindBy(xpath = "//span[@innertext='Pro']")
    WebElement Pro;

    @FindBy(xpath = "//span[@innertext='Mobile Apps']")
    WebElement mobileApps;

    @FindBy(xpath = "//span[@innertext='Products']")
    WebElement products;

    @FindBy(xpath = "//span[@innertext='Business Solutions']")
    WebElement BusinessSolutions;

    @FindBy(xpath = "//span[@innertext='API & Developer Solutions']")
    WebElement APIDeveloperSolutions;

    @FindBy(xpath = "//span[@innertext='Resources & Tools']")
    WebElement ResourcesTools;

    @FindBy(xpath = "//span[@innertext='About']")
    WebElement about;

    @FindBy(xpath = "//span[@innertext='Contact']")
    WebElement contact;

    @FindBy(xpath = "//span[@innertext='Connect']")
    WebElement connect;

    @FindBy(xpath = "//span[contains(text(),'Enlarge')]")
    WebElement enlarge;

    @FindBy(linkText = "Marvin Gaye")
    WebElement MarvinGaye;

    @FindBy(xpath = "//span[contains(text(),'Show trigonometric form')]")
    WebElement ShowTrigonometricForm;

    @FindBy(xpath = "button[@value='√']")
    WebElement sqrtBtn;



    // Initializing the Page Objects:
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTitle() {
        return driver.getTitle();
    }

    public boolean validateWolframAlphaImage() {
        return WolframAlphaLogo.isDisplayed();
    }


    //public boolean verifyCorrectUserName(){
//	return userNameLabel.isDisplayed();
//}
//
    public void InputSearchBox() {
        searchBox.sendKeys("2 + 2");
    }


    public boolean WolframAlphaLogo() {
        return WolframAlphaLogo.isDisplayed();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public WebElement clickInputAreaLink() {
        inputArea.click();
        return null;
    }

    public void clickContinueInComputableNotebookLink() {
        ContinueInComputableNotebookLink.click();
    }

    public void clickPlainText() {
        plainText.click();
    }


    //  public String enterInfo() {
// searchBox.sendKeys(prop.getProperty("i"));
// searchBox.sendKeys(prop.getProperty("addition"));
// searchBox.sendKeys(prop.getProperty("j").toString());
    //}


    //
//public DealsPage clickOnDealsLink(){
//	dealsLink.click();
//	return new DealsPage();
//}
//
//public TasksPage clickOnTasksLink(){
//	tasksLink.click();
//	return new TasksPage();
//}
//
//public void clickOnNewContactLink(){
//	Actions action = new Actions(driver);
//	action.moveToElement(contactsLink).build().perform();
//	newContactLink.click();
//	
//}
    public void goToSearchBox() {
        searchBox.sendKeys("2+2");
    }

    public boolean goToExtendedKeyboard() {
        ExtendedKeyboard.click();
        return true;
    }

    public void goToUpload() {
        upload.click();
    }

    public void goToExamples() {
        examples.click();
    }

    public void goToRandom() {
        random.click();
    }

    public void goToMathematics() {
        Mathematics.click();
    }

    public void goToScienceAndTechnology() {
        ScienceAndTechnology.click();
    }

    public void goToSocietyAndCulture() {
        SocietyAndCulture.click();
    }

    public void goToEverydayLife() {
        EverydayLife.click();
    }

    public void goToStepByStepSolutions() {
        StepByStepSolutions.click();
    }

    public void goToElementaryMath() {
        ElementaryMath.click();
    }

    public void goToAlgebra() {
        Algebra.click();
    }

    public void goToPlottingAndGraphics() {
        PlottingAndGraphics.click();
    }

    public void goToCalculusAndAnalysis() {
        CalculusAndAnalysis.click();
    }

    public void goToGeometry() {
        Geometry.click();
    }

    public void goToDifferentialEquations() {
        DifferentialEquations.click();
    }

    public void goToStatistics() {
        Statistics.click();
    }

    public void goToMoreTopicsMathematics() {
        MoreTopicsMathematics.click();
    }

    public void goToUnitsAndMeasures() {
        UnitsAndMeasures.click();
    }

    public void goToPhysics() {
        Physics.click();
    }

    public void goToChemistry() {
        Chemistry.click();
    }

    public void goToEngineering() {
        Engineering.click();
    }

    public void goToComputationalSciences() {
        ComputationalSciences.click();
    }

    public void goToEarthSciences() {
        EarthSciences.click();
    }

    public void goToMaterials() {
        Materials.click();
    }

    public void goToTransportation() {
        Transportation.click();
    }

    public void goToMoreTopicsScienceAndTechnology() {
        MoreTopicsScienceAndTechnology.click();
    }

    public void goToPeople() {
        People.click();
    }

    public void goTArtsAndMedia() {
        ArtsAndMedia.click();
    }

    public void goToDatesAndTimes() {
        DatesAndTimes.click();
    }

    public void goToWordsAndLinguistics() {
        WordsAndLinguistics.click();
    }

    public void goToMoneyAndFinance() {
        MoneyAndFinance.click();
    }

    public void goToFoodAndNutrition() {
        FoodAndNutrition.click();
    }

    public void goToPoliticalGeography() {
        PoliticalGeography.click();
    }

    public void goToHistory() {
        History.click();
    }

    public void goToMoreTopicsSocietyAndCulture() {
        MoreTopicsSocietyAndCulture.click();
    }

    public void goToPersonalHealth() {
        PersonalHealth.click();
    }

    public void goToPersonalFinance() {
        PersonalFinance.click();
    }

    public void goToSurprises() {
        Surprises.click();
    }

    public void goToEntertainment() {
        Entertainment.click();
    }

    public void goToHouseholdScience() {
        HouseholdScience.click();
    }

    public void goToHouseholdMath() {
        HouseholdMath.click();
    }

    public void goToHobbies() {
        Hobbies.click();
    }

    public void goToTodaysWorld() {
        TodaysWorld.click();
    }

    public void goToMoreTopicsEverydayLife() {
        MoreTopicsEverydayLife.click();
    }

    public void goToTourPage() {
        toTourPage.click();
    }

    public void goToProLink() {
        Pro.click();
    }

    public void goToWebApps() {
        webApps.click();
    }

    public void goToMobileApps() {
        mobileApps.click();
    }

    public void goToProducts() {
        products.click();
        ;
    }

    public void goToBusinessSolutions() {
        BusinessSolutions.click();
    }

    public void goToApiAndDeveloperSolutions() {
        APIDeveloperSolutions.click();
    }

    public void goToResourcesAndTools() {
        ResourcesTools.click();
    }

    public void goToAbout() {
        about.click();
    }

    public void goToContact() {
        contact.click();
    }

    public void goToConnect() {
        connect.click();
    }

    public void goToEnlarge() {
        enlarge.click();
    }

    public  void goToMarvinGayeLink(){
        MarvinGaye.click();
    }

    public void goToShowTrigonometricForm(){
        ShowTrigonometricForm.click();
    }

    public void goToSqrtFn(){
        sqrtBtn.click();
    }


}
