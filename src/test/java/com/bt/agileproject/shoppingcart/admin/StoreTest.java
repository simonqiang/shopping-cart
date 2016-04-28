package com.bt.agileproject.shoppingcart.admin;

import com.bt.agileproject.shoppingcart.Store;
import com.opencsv.CSVReader;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class StoreTest {
    @Test
    public void import_the_products_and_their_prices_from_CSV_file() throws IOException {
        CSVReader csvReader = new CSVReader(new InputStreamReader(
                this.getClass().getClassLoader().getResourceAsStream("productlist.csv")));
        Store store = new Store(csvReader);
        store.importProductFromCSV();
    }

}
