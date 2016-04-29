package com.bt.agileproject.shoppingcart.product;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class Product {
    protected String name;
    protected BigDecimal price;
    private DecimalFormat nf = new DecimalFormat("#.00");
    protected Long id;
    protected int quantity;
    private Date discountStartDate;
    private Date discountEndDate;
    private double discount;
    private boolean multiBuy;

    public Product(Long id, String name, BigDecimal price) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return name+" "+nf.format(price.doubleValue());
    }
}
