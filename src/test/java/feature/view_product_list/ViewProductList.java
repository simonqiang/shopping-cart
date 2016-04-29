package feature.view_product_list;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import com.bt.agileproject.shoppingcart.Store;

import static org.junit.Assert.assertEquals;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class ViewProductList {
    private Store store = new Store();
    private String screenText;

    @When("^Customer view the product catalogue$")
    public void customerViewTheProductCatalogue() throws Throwable {
        screenText = store.catalogDisplay();
    }

    @Then("^Display message \"([^\"]*)\"$")
    public void displayMessage(String expected) throws Throwable {
        assertEquals(expected, screenText);
    }

    @Then("^Display all products in product catalogue$")
    public void displayAllProductsInProductCatalogue() throws Throwable {
        assertEquals("[notebook]", screenText);
    }


    @Given("^There (is no product|are products) in product catalogue$")
    public void thereAreProductsInProductCatalogue(String condition) throws Throwable {
        if ("are products".equals(condition)) {

        } else {
            // Nothing to do for is no
        }
    }

}
