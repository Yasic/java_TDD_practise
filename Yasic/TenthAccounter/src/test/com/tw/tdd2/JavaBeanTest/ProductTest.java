package com.tw.tdd2.JavaBeanTest;

import com.tw.tdd2.Exception.EmptyStringInInitialException;
import com.tw.tdd2.JavaBean.Product;
import org.junit.Test;

/**
 * Created by yasic on 16-7-8.
 */
public class ProductTest {

    @Test(expected = EmptyStringInInitialException.class)
    public void InitializeWithEmptyStringShouldThrowEmptyException() throws Exception{
        Product product = new Product.Builder().setBarcode("").build();
    }

    @Test(expected = EmptyStringInInitialException.class)
    public void InitializeWithNullStringShouldThrowEmptyException() throws Exception{
        Product product = new Product.Builder().setBarcode(null).build();
    }

    @Test
    public void IntializeWithoutEmptyStringShouldNotThrowException() throws Exception{
        Product product = new Product.Builder().setBarcode("123").build();
    }


}