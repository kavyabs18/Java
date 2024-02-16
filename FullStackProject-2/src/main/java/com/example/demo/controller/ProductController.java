package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	//Get List of Products
	@GetMapping (value="/get")
	public List<Product> getProduct() {
		return productService.getProduct();
	}
	
	//Get Product by id
	@GetMapping (value="/getbyid/{pid}")
	public Product getProductById(@PathVariable long pid) {
		return productService.getProductById(pid);
	}
	
	//Get Product by name
	@GetMapping (value="/getbyname/{pname}")
	public Product getProductByName(@PathVariable String pname) {
		return productService.getProductByName(pname);
	}
	
	//Insert into Product DB
	@PostMapping (value="/post")
	public Product postProduct(@RequestBody Product product) {
		return productService.postProduct(product);
		
	}
	
	//Delete Product by Id
	@DeleteMapping (value="/delete/{pid}")
	public String deleteProduct(@PathVariable long pid){
		return productService.deleteProduct(pid);
		
	}
	
	//Update Product by Id
	@PutMapping (value="/put/{pid}")
	public String updateProduct(@PathVariable long pid,
			@RequestBody Product product) {
		return productService.updateProduct(pid, product);
	}
}
