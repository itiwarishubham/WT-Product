package com.wissen.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.daoImpl.ProductInMemory;
import com.wissen.entity.Product;
import com.wissen.service.ProductServiceInMemory;

@Service
public class ProductServiceInMemoryImpl implements ProductServiceInMemory{

	@Autowired
	ProductInMemory productdao;
	
	public Product addProduct(Product product) {
		return productdao.addProduct(product);
	}

	public Product deleteProduct(Long prodId) {
		return productdao.deleteProduct(prodId);
	}

	public Product findProduct(Long productId) {
		return productdao.findProduct(productId);
	}

	public List<Product> showAllProducts() {
		return productdao.showAllProducts();
	}

}
