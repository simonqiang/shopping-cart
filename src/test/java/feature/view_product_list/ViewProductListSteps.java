package feature.view_product_list;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
<<<<<<< HEAD:src/test/java/feature/view_product_list/ViewProductListSteps.java
import shoppingcart.Product;
import shoppingcart.Store;
=======
import cucumber.api.junit.Cucumber;
import com.bt.agileproject.shoppingcart.Store;
>>>>>>> origin/master:src/test/java/feature/view_product_list/ViewProductList.java

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
<<<<<<< HEAD:src/test/java/feature/view_product_list/ViewProductListSteps.java
            Product product = new Product(1L, "Notebook",new BigDecimal(2.30));
            store.add(product);
=======

        } else {
            // Nothing to do for is no
>>>>>>> origin/master:src/test/java/feature/view_product_list/ViewProductList.java
        }
    }

}
