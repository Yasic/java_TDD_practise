package com.tw.tdd2.Model;

import com.tw.tdd2.Exception.EmptyStringInMethodException;
import com.tw.tdd2.JavaBean.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yasic on 16-7-8.
 */
public class ProductListModelTest {
    @Test(expected = EmptyStringInMethodException.class)
    public void NullStringShouldThrowExceptionWhenIsToBeConvertedToNonRepeatList() throws Exception {
        ProductListModel.getInsance().convertProductListToNonRepeatList(null);
    }

    @Test(expected = EmptyStringInMethodException.class)
    public void EmptyStringShouldThrowExceptionWhenIsToBeConvertedToNonRepeatList() throws Exception {
        ProductListModel.getInsance().convertProductListToNonRepeatList("");
    }

    @Test
    public void VirtualStringDataShouldReturnNonRepeatListByConvertMethod() throws Exception {
        ProductListModel productListModel = ProductListModel.getInsance();
        List<Product> productList = new ArrayList<>();
        productList.add(new Product.Builder().setBarcode("ITEM000001").setNumber(5).build());
        productList.add(new Product.Builder().setBarcode("ITEM000003").setNumber(2).build());
        productList.add(new Product.Builder().setBarcode("ITEM000005").setNumber(3).build());
        Assert.assertEquals(productListModel.convertProductListToNonRepeatList(productListModel.getVirtualStringData()),
                productList);
    }

    @Test
    public void ProductInfoShouldBeSetToNonRepeatList() throws Exception {
        ProductListModel productListModel = ProductListModel.getInsance();
        List<Product> productListReturn = productListModel.setProductInfoOfNonRepeatList(productListModel.convertProductListToNonRepeatList(productListModel.getVirtualStringData()));
        List<Product> productList = new ArrayList<>();
        productList.add(new Product.Builder().setBarcode("ITEM000001").setName("篮球").setCategory("体育").setSubCateGory("球类").setPrice(98).setNumber(5).build());
        productList.add(new Product.Builder().setBarcode("ITEM000003").setName("可口可乐").setCategory("饮料").setSubCateGory("碳酸饮料").setPrice(3).setNumber(2).build());
        productList.add(new Product.Builder().setBarcode("ITEM000005").setName("苹果").setCategory("食物").setSubCateGory("水果").setPrice(5.5f).setNumber(3).build());
        Assert.assertEquals(productListReturn, productList);
    }

}