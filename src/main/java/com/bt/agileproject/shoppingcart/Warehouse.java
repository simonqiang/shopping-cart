package com.bt.agileproject.shoppingcart;

import com.bt.agileproject.shoppingcart.product.WarehouseProduct;
import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
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

    public Warehouse(CSVReader csvReader)
    {
        this.csvReader = csvReader;
    }

    public void importProductFromCSV() throws IOException {
        String [] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            products.add(convertToProduct(nextLine[0],
                    nextLine[1],
                    nextLine[2],
                    nextLine[3],
                    nextLine[4],
                    nextLine[5],
                    nextLine[6],
                    nextLine[7]));
        }
    }

    private WarehouseProduct convertToProduct(String name, String price, String id,
                                              String quantity, String discountStartDate, String discountEndDate,
                                              String discount, String multiBuy)
    {
        Date startDate = null;
        Date endDate = null;
        boolean isMultiBuy = false;
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

            return new WarehouseProduct(name, Double.parseDouble(price), id, Integer.parseInt(quantity), startDate, endDate, Double.parseDouble(discount), isMultiBuy);
        } catch (ParseException e) {
            return null;
        }
    }

    public List<WarehouseProduct> getProducts() {
        return products;
    }

}
