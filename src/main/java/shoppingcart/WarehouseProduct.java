package shoppingcart;

import java.util.Date;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class WarehouseProduct extends Product {
    private Date discountStartDate;
    private Date discountEndDate;
    private double discount;
    private boolean multiBuy;

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
