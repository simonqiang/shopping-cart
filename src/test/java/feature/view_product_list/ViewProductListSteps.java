package feature.view_product_list;

import com.bt.agileproject.shoppingcart.Store;
import com.bt.agileproject.shoppingcart.product.Product;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class ViewProductListSteps {
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
        assertEquals("[Notebook 2.30]", screenText);
    }


    @Given("^There (is no product|are products) in product catalogue$")
    public void thereAreProductsInProductCatalogue(String condition) throws Throwable {
        if ("are products".equals(condition)) {
            Product product = new Product(1L, "Notebook", new BigDecimal(2.30));
            store.add(product);
        }
    }

}
