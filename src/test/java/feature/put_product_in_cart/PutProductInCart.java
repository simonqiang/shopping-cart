package feature.put_product_in_cart;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by 608729600 on 4/29/2016.
 */
public class PutProductInCart {
    @Given("^The cart (is|is not) empty$")
    public void theCartIsEmpty() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^Customer add ([^\"]*) product$")
    public void customerAddNotebookProduct(String product) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^([^\"]*) product quantity will increase by (\\d+)$")
    public void notebookProductQuantityWillIncreaseBy(String product, int quantity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^The cart has ([^\"]*) product with quantity (\\d+)$")
    public void theCartHasNotebookProductWithQuantity(String product, int quantity) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^The ([^\"]*) product is out of stock$")
    public void theMouseProductIsOutOfStock(String product) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
