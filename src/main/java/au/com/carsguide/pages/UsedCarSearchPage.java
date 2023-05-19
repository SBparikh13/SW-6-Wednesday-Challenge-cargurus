package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import cucumber.api.DataTable;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class UsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarSearchPage.class.getName());

    public UsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedTab;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Used Cars For Sale']")
    WebElement usedCarForSaleText;


    public void clickOnUsedTab(){
        mouseHoverToElementAndClick(usedTab);
        log.info("Click on " + usedTab.toString());
    }

    public void verifyUsedCarSaleText(String expected){
        Assert.assertEquals(usedCarForSaleText.getText(),expected);
        log.info("Verify the text " + usedCarForSaleText.toString());
    }

}
