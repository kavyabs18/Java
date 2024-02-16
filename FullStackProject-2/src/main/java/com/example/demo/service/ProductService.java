package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	public List<Product> getProduct();

	public Product getProductById(long pid);

	public Product getProductByName(String pname);

	public Product postProduct(Product product);

	public String deleteProduct(long pid);

	public String updateProduct(long pid, Product product);

}
