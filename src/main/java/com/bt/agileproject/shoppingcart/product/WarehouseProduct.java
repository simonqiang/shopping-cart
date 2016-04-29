package com.bt.agileproject.shoppingcart.product;

import com.bt.agileproject.shoppingcart.product.Product;

import java.util.Date;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class WarehouseProduct extends Product {


    public WarehouseProduct(String name, double price, String id,
                            int quantity, Date discountStartDate, Date discountEndDate,
                            double discount, boolean multiBuy) {
        setName(name);
        setPrice(price);
        setId(id);
        setDiscountStartDate(discountStartDate);
        setDiscountEndDate(discountEndDate);
        setDiscount(discount);
        setMultiBuy(multiBuy);
        setQuantity(quantity);
    }
}
