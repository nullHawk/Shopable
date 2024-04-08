package com.nullhawk.shopable.services;


import com.nullhawk.shopable.models.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProducts();
    public Product getProduct(Long id) throws ProductNotFoundException;
    public Product addProduct(Product product);
    public Product updateProduct(Product product);
    public void deleteProduct(Long id);
    public List<Product> getProductsByCategory(String categoryName) throws ProductNotFoundException;
    public List<String> getCategories();
    public List<Product> getLimitedProducts(int limit);
    public List<Product> getSortedProducts(String sort);

}