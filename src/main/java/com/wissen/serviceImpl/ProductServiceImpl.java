package com.wissen.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wissen.dao.ProductDAO;
import com.wissen.entity.Product;
import com.wissen.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO productDAO;

	public Product addProduct(Product product) {
		return productDAO.save(product);
	}

	public Product deleteProduct(Long prodId) {
		Optional<Product> pro = productDAO.findById(prodId);
		productDAO.deleteById(prodId);
		return pro.get();
	}

	public Product findProduct(Long productId) {
		Optional<Product> pro = productDAO.findById(productId);
		return pro.get();
	}

	public List<Product> showAllProducts() {
		return productDAO.findAll();
	}

}
