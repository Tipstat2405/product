package com.ecomerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ecomerce.model.Product;
import com.ecomerce.request.ProductRequest;
import com.ecomerce.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
//	@GetMapping("/create")
//	public void message() {
//		System.out.println("Hello Rayudu");
//	}

	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductRequest productRequest) {
		
		productService.createProductService(productRequest);
	    System.out.println("Data Saved successfully"+productRequest.getName());
	}
	
	@GetMapping("/productlist")
	public List<Product> getListOfProducts(){
		
		return productService.fetchListOfProducts();
	}
}
