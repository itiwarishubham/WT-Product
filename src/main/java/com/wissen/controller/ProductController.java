package com.wissen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wissen.dao.ProductDAO;
import com.wissen.entity.Product;
import com.wissen.serviceImpl.ProductServiceImpl;

@RestController
@CrossOrigin(origins="http://localhost:4200") 
public class ProductController {
	
	@Autowired
	ProductServiceImpl productServiceImpl;
	
	@GetMapping("/product-list")
	public List<Product> getAllProducts() {
		return productServiceImpl.showAllProducts();
	}
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product ) {
		return productServiceImpl.addProduct(product);
	}
	
	@GetMapping("/product-detail/{productId}")
	public Product getProduct(@PathVariable("productId") Long productId ) {
		return productServiceImpl.findProduct(productId);
	}

}
