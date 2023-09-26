package com.ecomerce.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ecomerce.model.Product;

public interface ProductServiceRepository extends MongoRepository<Product, String>{

}
