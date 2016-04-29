package com.bt.agileproject.shoppingcart.admin;

import com.bt.agileproject.shoppingcart.Warehouse;
import com.bt.agileproject.shoppingcart.product.Product;
import com.bt.agileproject.shoppingcart.product.WarehouseProduct;
import com.bt.agileproject.shoppingcart.store.Order;
import com.opencsv.CSVReader;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
        assertEquals(3000d, warehouseProduct.getPrice().doubleValue(), 0);
        assertEquals(10000L, warehouseProduct.getId().longValue());
        assertEquals(0d, warehouseProduct.getDiscount(), 0);
        assertEquals(false, warehouseProduct.isMultiBuy());

        warehouseProduct = warehouse.getProducts().get(1);

        assertEquals("iphone 6 plus", warehouseProduct.getName());
        assertEquals(4000d, warehouseProduct.getPrice().doubleValue(), 0);
        assertEquals(10001L, warehouseProduct.getId().longValue());
        assertEquals(0d, warehouseProduct.getDiscount(), 0);
        assertEquals(false, warehouseProduct.isMultiBuy());

    }

    @Test
    public void test_view_undispatched_orders() throws IOException {
        Warehouse warehouse = new Warehouse(populate_sample_orders(new ArrayList<Order>()));

        assertEquals(7, warehouse.getOrders().size());

        assertEquals(7, warehouse.getUndispatchedOrders().size());

        warehouse.getOrders().get(1).setIs_dispatched(true);
        assertEquals(6, warehouse.getUndispatchedOrders().size());

        for(String string : warehouse.getUndispatchedOrders())
        {
            System.out.println(string);
        }

    }

    private List<Order> populate_sample_orders(List<Order> orderList) throws IOException {
        CSVReader csvReader = new CSVReader(new InputStreamReader(getClass().getClassLoader().getResourceAsStream("productlist.csv")));
        Warehouse warehouse = new Warehouse(csvReader);
        warehouse.importProductFromCSV();

//        Random randomGenerator = new Random();
        for (Product product : warehouse.getProducts())
        {
            Order order = new Order(product);
            order.setOrder_quantity(2);
//            order.setIs_dispatched(randomGenerator.nextBoolean());
            orderList.add(order);
        }

        return orderList;
    }

}
