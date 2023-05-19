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

public class FindDealersPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindDealersPage.class.getName());

    public FindDealersPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealer;

    @CacheLookup
    @FindBy(xpath = "//h1[@class=\"dealer-title\"]")
    WebElement carDealershipText;
    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-label='view dealer']")
    WebElement viewDealer;
    @CacheLookup
    @FindBy(xpath = "//div[@class='dealer-listings row']")
    List<WebElement> dealersNameList;

    public void clickOnFindDealer(){
        mouseHoverToElementAndClick(findDealer);
        log.info("click on  " + findDealer.toString());
    }
    public void verifyCarDealershipText(String expected){
        log.info("Verify the text " + carDealershipText.toString());
        Assert.assertEquals(carDealershipText.getText(),expected);
    }

    public void clickOnViewDealer(){
        mouseHoverToElementAndClick(viewDealer);
    }
    public void listOfDealersName(DataTable dataTable){
        List<List<String>> dealerList = dataTable.asLists(String.class);
        for (List<String> dealerName : dealerList) {
                System.out.println(dealerName);
        }

    }
    public void verifyDealersName(List<WebElement> dealersNameList) {

        if (dealersNameList.equals("3 Point Motors Epping")) {
            clickOnViewDealer();
        } else if (dealersNameList.equals("4WD Specialist Group")) {
            clickOnViewDealer();
            //            case "Study":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "Transit (on your way to somewhere else)":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "Join partner or family for a long stay":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "Get married or enter into a civil partnership":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "Stay with your child, if they’re at school":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "Have medical treatment":
//                clickOnElement( reasonForVisitList, reason);
//                break;
//            case "For official diplomatic or government business (including transit through the UK)":
//                clickOnElement( reasonForVisitList, reason);
//                break;
        } else {
            System.out.println("Wrong name");
        }

    }

}
