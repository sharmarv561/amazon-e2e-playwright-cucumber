package stepDefs;

import com.amazon.base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.amazon.pages.HomePage;

public class SearchSteps extends BaseTest {

    HomePage homePage;

    @Given("I launch the Amazon homepage")
    public void i_launch_the_amazon_homepage() {
        driver.get(config.getProperty("baseUrl"));
        homePage = new HomePage(driver);
    }

    @When("I search for {string}")
    public void iSearchFor(String product) {
        homePage.searchFor(product);

    }

    @And("I click on the first product in results")
    public void iClickOnTheFirstProductInResults() {

    }

    @And("I add the item to the cart")
    public void iAddTheItemToTheCart() {
    }

    @Then("the item should be successfully added to the cart")
    public void theItemShouldBeSuccessfullyAddedToTheCart() {
    }
}
