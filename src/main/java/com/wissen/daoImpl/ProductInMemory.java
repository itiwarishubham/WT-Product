package com.wissen.daoImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Repository;

import com.wissen.dao.ProductInMemoryDAO;
import com.wissen.entity.Product;

@Repository
public class ProductInMemory implements ProductInMemoryDAO {

	private HashMap<Long, Product> productData = new HashMap<Long, Product>();

	public Product addProduct(Product product) {
		productData.put(product.getProdId(), product);
		return product;
	}

	public Product deleteProduct(Long prodId) {
		return productData.remove(prodId);
	}

	public Product findProduct(Long productId) {
		return productData.get(productId);
	}

	public List<Product> showAllProducts() {
		return new ArrayList<Product>(productData.values());
	}

}
