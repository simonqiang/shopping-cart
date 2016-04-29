package com.bt.agileproject.shoppingcart;

import com.bt.agileproject.shoppingcart.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class Store {

    private List<Product> products = new ArrayList<Product>();

    public Store() {

    }

    public Store(List<Product> products) {
        this.products = products;
    }

    public String catalogDisplay() {
        if (products.isEmpty()) {
            return "There is no product available";
        }
        return products.toString();
    }

    public void add(Product item) {
        products.add(item);
    }
}
