package com.bt.agileproject.shoppingcart.store;

import com.bt.agileproject.shoppingcart.product.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 608729600 on 4/29/2016.
 */
public class ShoppingCart {
    private List<Product> products = new ArrayList<Product>();

    public void clear() {
        products = new ArrayList<Product>();
    }

    public void add(Product item) {
        products.add(item);
    }

    public int productQuantity(String name) {
        int quantity = 0;
        if (!products.isEmpty()) {
            for (Product product : products) {
                if (name.equals(product.getName())) {
                    quantity++;
                }
            }
        }
        return quantity;
    }
}
