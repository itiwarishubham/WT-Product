package com.wissen.dao;

import java.util.List;

import com.wissen.entity.Product;

public interface ProductInMemoryDAO {

	Product addProduct(Product product);
	Product deleteProduct(Long prodId);
	Product findProduct(Long productId);
	List<Product> showAllProducts();
}
