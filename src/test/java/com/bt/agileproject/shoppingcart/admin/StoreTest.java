package com.bt.agileproject.shoppingcart.admin;

import com.bt.agileproject.shoppingcart.Store;
import com.opencsv.CSVReader;
import org.junit.Test;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class StoreTest {
    @Test
    public void import_the_products_and_their_prices_from_CSV_file()
    {
        CSVReader csvReader = new CSVReader();
        Store store = new Store(csvReader);
        store.importProductFromCSV();
    }

}
