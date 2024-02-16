package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepository productRepository;

	public List<Product> getProduct() {
		List<Product> product = productRepository.findAll();
		return product;
	}

	public Product getProductById(long pid) {
		Optional<Product> product = productRepository.findById(pid);
		return product.orElse(null);
	}

	public Product getProductByName(String pname) {
		Product product = productRepository.findByName(pname);
		return product;
	}

	public Product postProduct(Product product) {
		Product p = productRepository.save(product);
		return p;
	}
	
	public String deleteProduct(long pid) {
		productRepository.deleteById(pid);
		return "Deletion Success";
	}

	public String updateProduct(long pid, Product updatingProduct) {
		Optional<Product> existingProduct = productRepository.findById(pid);
		if(existingProduct.isPresent()) {
			//modify in app layer
			Product product = existingProduct.get();
			product.setPname(updatingProduct.getPname());
			product.setPdetails(updatingProduct.getPdetails());
			product.setPtxno(updatingProduct.getPtxno());
			product.setPstatus(updatingProduct.getPstatus());
			
			//save the updated record
			productRepository.save(product);
			return "Update Success";
		}
		else {
			return "No Record Found";
		}
	}
}
