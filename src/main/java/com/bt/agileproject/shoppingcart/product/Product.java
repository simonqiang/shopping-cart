package com.bt.agileproject.shoppingcart.product;

import java.util.Date;
import java.util.UUID;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class Product {
    protected String name;
    protected double price;
    protected String id;
    protected int quantity;
    private Date discountStartDate;
    private Date discountEndDate;
    private double discount;
    private boolean multiBuy;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDiscountStartDate() {
        return discountStartDate;
    }

    public void setDiscountStartDate(Date discountStartDate) {
        this.discountStartDate = discountStartDate;
    }

    public Date getDiscountEndDate() {
        return discountEndDate;
    }

    public void setDiscountEndDate(Date discountEndDate) {
        this.discountEndDate = discountEndDate;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean isMultiBuy() {
        return multiBuy;
    }

    public void setMultiBuy(boolean multiBuy) {
        this.multiBuy = multiBuy;
    }
}
