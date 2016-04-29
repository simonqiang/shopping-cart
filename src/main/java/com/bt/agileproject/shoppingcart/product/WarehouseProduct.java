package com.bt.agileproject.shoppingcart.product;

import com.bt.agileproject.shoppingcart.product.Product;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class WarehouseProduct extends Product {


    public WarehouseProduct(String name, BigDecimal price, Long id,
                            int quantity, Date discountStartDate, Date discountEndDate,
                            double discount, boolean multiBuy) {
        super(id, name, price);
        setDiscountStartDate(discountStartDate);
        setDiscountEndDate(discountEndDate);
        setDiscount(discount);
        setMultiBuy(multiBuy);
        setQuantity(quantity);
    }
}
