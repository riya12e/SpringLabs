package com.capg.springRest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller
public class UserController {
    
	@RequestMapping("/newProduct")
	public String saveProduct() {
		return "addProduct";
		
	}
	
	@RequestMapping("/viewProducts")
	public String displayProducts() {
		return "viewProducts";
		
	}
	
	@RequestMapping("/viewAProduct")
	public String displayProduct() {
		return "viewAProduct";
	}
	
	@RequestMapping(value="/addProduct",method = RequestMethod.POST)
	public String addProduct(@ModelAttribute("product") Product product,ModelMap map) {
		String uri="http://localhost:8775/SpringRestAssign/addProduct";
		RestTemplate restTemplate = new RestTemplate();
	    Product savedProduct = restTemplate.postForObject(uri, product, Product.class);
	    map.addAttribute("msg","Product is added sucessfuly with product Id "+savedProduct.getProdId());
		return "showPage";
		
	}
	
	@RequestMapping(value="/viewById",method = RequestMethod.POST)
	public String viewProduct(@RequestParam("prodId") int prodId,ModelMap map) {
		String uri="http://localhost:8775/SpringRestAssign/view";
		RestTemplate restTemplate = new RestTemplate();
	   Product product= restTemplate.getForObject(uri+"/"+prodId, Product.class);
	   map.addAttribute("product",product);
		return "showPage";
	
	}
	
	@RequestMapping(value="/viewAll")
	public String viewAllProducts(ModelMap map) {
		String uri="http://localhost:8775/SpringRestAssign/viewAllProducts";
		RestTemplate restTemplate = new RestTemplate();
	   Product[] products= restTemplate.getForObject(uri, Product[].class);
	   map.addAttribute("products",products);
		return "viewProducts";
}
}
