package com.bt.agileproject.shoppingcart.store;

import com.bt.agileproject.shoppingcart.product.Product;

/**
 * Created by 608502920 on 4/29/2016.
 */
public class Order {
    private Product product;
    private int order_quantity;
    private boolean is_dispatched = false;

    public Order(Product product)
    {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrder_quantity() {
        return order_quantity;
    }

    public void setOrder_quantity(int order_quantity) {
        this.order_quantity = order_quantity;
    }

    public boolean is_dispatched() {
        return is_dispatched;
    }

    public void setIs_dispatched(boolean is_dispatched) {
        this.is_dispatched = is_dispatched;
    }

    public String toString()
    {
        return "Name: " + product.getName() + " price : " + product.getPrice().doubleValue() + " order quantity : " + order_quantity;
    }

}
