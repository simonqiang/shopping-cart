package feature.put_product_in_cart;

import com.bt.agileproject.shoppingcart.product.Product;
import com.bt.agileproject.shoppingcart.store.ShoppingCart;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by 608729600 on 4/29/2016.
 */
public class PutProductInCart {
    private ShoppingCart shoppingCart = new ShoppingCart();;

    @Given("^The cart (is|is not) empty$")
    public void theCartIsEmpty(String isEmpty) throws Throwable {
        if ("is".equals(isEmpty)) {
            shoppingCart.clear();
        }
    }

    @When("^Customer add ([^\"]*) product$")
    public void customerAddNotebookProduct(String productName) throws Throwable {
        shoppingCart.add(new Product(1L, productName, new BigDecimal(2.30)));
    }

    @Then("^([^\"]*) product total quantity is (\\d+)$")
    public void notebookProductQuantityWillIncreaseBy(String productName, int quantity) throws Throwable {
        assertEquals(shoppingCart.productQuantity(productName), quantity);
    }

    @Given("^The cart has ([^\"]*) product with quantity (\\d+)$")
    public void theCartHasNotebookProductWithQuantity(String productName, int quantity) throws Throwable {
        for (int i = 0; i < quantity; i++) {
            shoppingCart.add(new Product(1L, productName, new BigDecimal(2.30)));
        }
    }

    @Given("^The ([^\"]*) product is out of stock$")
    public void theMouseProductIsOutOfStock(String productName) throws Throwable {

    }
}
