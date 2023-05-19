package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySellTab;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement searchCars;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement newAndUsedCarSearchText;





    public void mouseHoverBuySell(){
    mouseHoverToElement(buySellTab);
        log.info("Mouse hover on " + buySellTab.toString());
    }

    public void clickOnSearchCars(){
        mouseHoverToElementAndClick(searchCars);
        log.info("Click on " + searchCars.toString());
    }

    public String getNewAndUsedCarSearchText(){
        log.info("Get text " + newAndUsedCarSearchText.toString());
        return getTextFromElement(newAndUsedCarSearchText);
    }
    public void verifyNewAndUsedCarSearchText(String expected){
        Assert.assertEquals(newAndUsedCarSearchText.getText(),expected);
        log.info("Verify the text " + newAndUsedCarSearchText.toString());
    }


}


