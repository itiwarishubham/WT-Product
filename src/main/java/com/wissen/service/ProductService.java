package com.wissen.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wissen.entity.Product;

@Service
public interface ProductService {

	Product addProduct(Product product);
	Product deleteProduct(Long prodId);
	Product findProduct(Long productId);
	List<Product> showAllProducts();
}
