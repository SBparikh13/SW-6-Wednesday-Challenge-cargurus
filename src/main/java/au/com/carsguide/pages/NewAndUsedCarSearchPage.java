package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewAndUsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement makeField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement modelField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement locationField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement priceField;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement nextCarTab;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultText;



    public void selectCarMake(String carMake){
        selectByVisibleTextFromDropDown(makeField,carMake);
        log.info("Select car " + carMake.toString());
    }
    public void selectCarModel(String carModel){
        selectByVisibleTextFromDropDown(modelField,carModel);
        log.info("Select model " + modelField.toString());
    }
    public void selectLocation(String location){
        selectByVisibleTextFromDropDown(locationField,location);
        log.info("Select location " + locationField.toString());
    }
    public void selectPrice(String price){
        selectByVisibleTextFromDropDown(priceField,price);
        log.info("Select price " + priceField.toString());
    }
    public void clickNextCar(){
        mouseHoverToElementAndClick(nextCarTab);
        log.info("Click on  " + priceField.toString());

    }
//    public String getResultText(){
//        return getTextFromElement(resultText);
//    }
    public void verifyResultMake(String expected){
        log.info("Verify the text " + resultText.toString());
        Assert.assertEquals(resultText.getText(),expected);
    }







}
