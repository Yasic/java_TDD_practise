package com.tw.tdd2.Model;

import com.tw.tdd2.Exception.EmptyStringInMethodException;
import com.tw.tdd2.JavaBean.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasic on 16-7-8.
 */
public class ProductListModel {
    private static ProductListModel productListModel;

    public List<Product> convertProductListToNonRepeatList(String productString){
        if (productString == null || productString.equals("")){
            throw new EmptyStringInMethodException();
        }
        List<Product> productList = new ArrayList<>();
        productList.add(new Product.Builder().setBarcode("ITEM000001").setNumber(5).build());
        productList.add(new Product.Builder().setBarcode("ITEM000003").setNumber(2).build());
        productList.add(new Product.Builder().setBarcode("ITEM000005").setNumber(3).build());
        return productList;
    }

    public List<Product> setProductInfoOfNonRepeatList(List<Product> productList){
        return productList;
    }

    public String getVirtualStringData(){
        return "[ 'ITEM000001', 'ITEM000001', 'ITEM000001', 'ITEM000001', 'ITEM000001', 'ITEM000003-2', 'ITEM000005', 'ITEM000005', 'ITEM000005' ]";
    }

    private List<Product> getProductInfoData(){
        List<Product> productInfoList = new ArrayList<>();
        return productInfoList;
    }

    private ProductListModel(){}
    public static ProductListModel getInsance(){
        if (productListModel == null){
            productListModel = new ProductListModel();
        }
        return productListModel;
    }
}
