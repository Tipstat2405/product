package com.ecomerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomerce.model.Product;
import com.ecomerce.repository.ProductServiceRepository;
import com.ecomerce.request.ProductRequest;

@Service
public class ProductService {

	@Autowired
	ProductServiceRepository productServiceRepository;
	
	public void createProductService(ProductRequest productRequest) {
		
		Product product = new Product(productRequest.getName(),productRequest.getDescription(),productRequest.getPrice());
		
		productServiceRepository.save(product);
		
	}
	
	public List<Product> fetchListOfProducts(){
		
		List<Product> products = productServiceRepository.findAll();
		return products;
	}
}
