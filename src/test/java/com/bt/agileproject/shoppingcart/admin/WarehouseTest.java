package com.bt.agileproject.shoppingcart.admin;

import com.bt.agileproject.shoppingcart.Warehouse;
import com.bt.agileproject.shoppingcart.product.WarehouseProduct;
import com.opencsv.CSVReader;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class WarehouseTest {

    @Test
    public void test_import_product_from_csv_file() throws IOException {
        CSVReader csvReader = new CSVReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("productlist.csv")));
        Warehouse warehouse = new Warehouse(csvReader);

        warehouse.importProductFromCSV();

        assertEquals(2, warehouse.getProducts().size());

        WarehouseProduct warehouseProduct = warehouse.getProducts().get(0);

        assertEquals("iphone 6", warehouseProduct.getName());
        assertEquals(3000d, warehouseProduct.getPrice(), 0);
        assertEquals("067e6162-3b6f-4ae2-a171-2470b63dff00", warehouseProduct.getId());
        assertEquals(0d, warehouseProduct.getDiscount(), 0);
        assertEquals(false, warehouseProduct.isMultiBuy());

        warehouseProduct = warehouse.getProducts().get(1);

        assertEquals("iphone 6 plus", warehouseProduct.getName());
        assertEquals(4000d, warehouseProduct.getPrice(), 0);
        assertEquals("067e6162-3b6f-4ae2-a171-2470b63dff11", warehouseProduct.getId());
        assertEquals(0d, warehouseProduct.getDiscount(), 0);
        assertEquals(false, warehouseProduct.isMultiBuy());

    }

    @Test
    public void test_view_dispatch 
}
