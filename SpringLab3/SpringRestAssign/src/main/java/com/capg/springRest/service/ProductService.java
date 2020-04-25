package com.capg.springRest.service;

import java.util.List;

import com.capg.springRest.repository.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public Product viewProduct(int id);
	public List<Product> viewAllProducts();
}
