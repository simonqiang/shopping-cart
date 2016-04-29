package com.bt.agileproject.shoppingcart;

import com.bt.agileproject.shoppingcart.product.WarehouseProduct;
import com.bt.agileproject.shoppingcart.store.Order;
import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 608502920 on 4/28/2016.
 */
public class Warehouse {
    private CSVReader csvReader;
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    private List<WarehouseProduct> products = new ArrayList<WarehouseProduct>();
    private List<Order> orders = new ArrayList<Order>();

    public Warehouse(List<Order> orders)
    {
        this.orders = orders;
    }

    public Warehouse(CSVReader csvReader)
    {
        this.csvReader = csvReader;
    }

    public void importProductFromCSV() throws IOException {
        String [] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            products.add(convertToProduct(nextLine));
        }
    }

    private WarehouseProduct convertToProduct(String[] aArray)
    {
        Date startDate = null;
        Date endDate = null;
        boolean isMultiBuy = false;

        String name = aArray[0];
        String price = aArray[1];
        String id = aArray[2];
        String quantity = aArray[3];
        String discountStartDate = aArray[4];
        String discountEndDate = aArray[5];
        String discount = aArray[6];
        String multiBuy = aArray[7];

        try {
            if(StringUtils.isNotEmpty(discountStartDate))
            {
                startDate = formatter.parse(discountStartDate);
            }

            if(StringUtils.isNotEmpty(discountEndDate))
            {
                endDate = formatter.parse(discountEndDate);
            }

            if(StringUtils.equals("1", multiBuy))
            {
                isMultiBuy = true;
            }

            return new WarehouseProduct(name, new BigDecimal(price), Long.valueOf(id), Integer.parseInt(quantity), startDate, endDate, Double.parseDouble(discount), isMultiBuy);
        } catch (ParseException e) {
            return null;
        }
    }

    public List<WarehouseProduct> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public List<String> getUndispatchedOrders() {
        List<String> tempList = new ArrayList<String>();
        for(Order order : getOrders())
        {
            if(!order.is_dispatched())
            {
                tempList.add(order.toString());
            }
        }
        return tempList;
    }
}
