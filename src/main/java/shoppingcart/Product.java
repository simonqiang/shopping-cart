package shoppingcart;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class Product {
    public Long id;
    public String name;
    public BigDecimal price;
    private DecimalFormat nf = new DecimalFormat("#.00");


    public Product(Long id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" "+nf.format(price);
    }
}
