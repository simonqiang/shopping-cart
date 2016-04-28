package com.bt.agileproject.shoppingcart;

import com.opencsv.CSVReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 608729600 on 4/28/2016.
 */
public class Store {

    private List<Product> products = new ArrayList<Product>();
    private CSVReader csvReader;

    public Store() {

    }

    public Store(List<Product> products) {
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

    public void add(Product item) {
        products.add(item);
    }

    public void importProductFromCSV() throws IOException {
        String [] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            // nextLine[] is an array of values from the line
            System.out.println(nextLine[0] + nextLine[1] + "etc...");
        }
    }
}
