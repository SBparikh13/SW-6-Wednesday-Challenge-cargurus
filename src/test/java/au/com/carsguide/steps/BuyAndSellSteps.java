package au.com.carsguide.steps;

import au.com.carsguide.pages.FindDealersPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.UsedCarSearchPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BuyAndSellSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {


    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        Thread.sleep(5000);
        new HomePage().mouseHoverBuySell();
    }

    @And("^I click on search cars tab$")
    public void iClickOnSearchCarsTab() {
        new HomePage().clickOnSearchCars();
    }
    @Then("^I navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String expected)  {
        new HomePage().verifyNewAndUsedCarSearchText(expected );

    }


    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String carMake ) {
        new NewAndUsedCarSearchPage().selectCarMake(carMake);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String carModel) {
        new NewAndUsedCarSearchPage().selectCarModel(carModel);
    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPrice(price);
    }

    @And("^I click on find my next car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickNextCar();
    }

    @Then("^I should be able to see the \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeThe(String expected ) {
        new NewAndUsedCarSearchPage().verifyResultMake(expected);
    }


    @And("^I click on used link$")
    public void iClickOnUsedLink() {
        new UsedCarSearchPage().clickOnUsedTab();
    }

    @Then("^I navigate to \"([^\"]*)\" text$")
    public void iNavigateToText(String expected)  {
        new UsedCarSearchPage().verifyUsedCarSaleText(expected);

    }

    @And("^I click on find a dealer$")
    public void iClickOnFindADealer() {
        new FindDealersPage().clickOnFindDealer();
    }
    @Then("^I navigate to \"([^\"]*)\" on dealer page$")
    public void iNavigateToOnDealerPage(String expected)  {
        new FindDealersPage().verifyCarDealershipText(expected);
    }



    @Then("^I verify \"([^\"]*)\" as table$")
    public void iVerifyAsTable(List<WebElement> dealersNameList)  {
        new FindDealersPage().verifyDealersName(dealersNameList);

    }


    @And("^I should see the dealers names as table$")
    public void iShouldSeeTheDealersNamesAsTable(DataTable dataTable)  {
        new FindDealersPage().listOfDealersName(dataTable);
    }
}
