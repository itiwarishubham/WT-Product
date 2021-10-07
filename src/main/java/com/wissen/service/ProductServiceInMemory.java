package com.wissen.service;

import java.util.List;

import com.wissen.entity.Product;

public interface ProductServiceInMemory {

	Product addProduct(Product product);
	Product deleteProduct(Long prodId);
	Product findProduct(Long productId);
	List<Product> showAllProducts();
}
