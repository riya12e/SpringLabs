package com.capg.springRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springRest.repository.Product;
import com.capg.springRest.service.ProductService;
import com.capg.springRest.service.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductServiceImpl service;
	
	@PostMapping(value="/addProduct", consumes= {"application/json"},produces= {"application/json"})
	public Product addProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	
	@GetMapping(value="/view/{prodId}", produces= {"application/json"})
	public Product viewProduct(@PathVariable("prodId") int prodId) {
		return service.viewProduct(prodId);
	}
	

	@GetMapping(value="/viewAllProducts", produces= {"application/json"})
	public List<Product> viewAllProducts() {
		return service.viewAllProducts();
	}
	
}
