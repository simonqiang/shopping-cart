package com.bt.agileproject.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class Store {

    private List<String> products = new ArrayList<String>();
    private CSVReader csvReader;

    public Store(List<String> products) {
        this.products = products;
    }

    public Store(CSVReader csvReader) {
        this.csvReader = csvReader;
    }

    public String catalogDisplay() {
        if (products.isEmpty()) {
            return "There is no product available";
        }
        return products.toString();
    }

    public void add(String item) {
        products.add(item);
    }

    public void importProductFromCSV() {

    }
}
