package com.nullhawk.shopable.models;

public class Product {
    private int productId;
    private int productQuantity;

    public Product(int productId, int productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}
