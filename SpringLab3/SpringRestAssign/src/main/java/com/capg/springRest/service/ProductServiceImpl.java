package com.capg.springRest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springRest.repository.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	private static List<Product> products=new ArrayList<>();
	
	static {
		Product p1=new Product(101,"Laptop",45678.34);
		Product p2=new Product(102,"Ipad",65678.84);
		Product p3=new Product(103,"Iphone",84678.34);
		Product p4=new Product(104,"Ipod",1200.99);
		Product p5=new Product(105,"Hard Disk",5000.0);
		Product p6=new Product(106,"Data Cables",2000.0);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		
	}
    @Override
	public Product addProduct(Product product) {
		
		products.add(product);
		return product;
	}
    @Override
	public Product viewProduct(int id) {
		
		Product product=null;
		for(Product p:products)
		{
			if(p.getProdId()==id) {
				product=p;
				break;
			}
		}
		return product;
	}
    @Override
	public List<Product> viewAllProducts() {
		
		return products;
	}
}
