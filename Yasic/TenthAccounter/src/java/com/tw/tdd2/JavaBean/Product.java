package com.tw.tdd2.JavaBean;

import com.tw.tdd2.Exception.EmptyStringInInitialException;

/**
 * Created by yasic on 16-7-8.
 */
public class Product {
    private String barcode;
    private String name;
    private String type;
    private String category;
    private String subCateGory;
    private int number;
    private float money;
    private float price;
    private boolean isProductPreferential;
    private Product() {
    }

    public static class Builder{
        private static Product product = new Product();
        public Builder setBarcode(String barcode) {
            if (barcode == null || barcode.equals("")){
                throw new EmptyStringInInitialException();
            }
            product.barcode = barcode;
            return this;
        }

        public Builder setName(String name) {
            product.name = name;
            return this;
        }

        public Builder setType(String type) {
            product.type = type;
            return this;
        }

        public Builder setCategory(String category) {
            product.category = category;
            return this;
        }

        public Builder setSubCateGory(String subCateGory) {
            product.subCateGory = subCateGory;
            return this;
        }

        public Builder setNumber(int number) {
            product.number = number;
            return this;
        }

        public Builder setMoney(float money) {
            product.money = money;
            return this;
        }

        public Builder setPrice(float price) {
            product.price = price;
            return this;
        }

        public Builder setProductPreferential(boolean productPreferential) {
            product.isProductPreferential = productPreferential;
            return this;
        }

        public Product build(){
            return product;
        }
    }


}
