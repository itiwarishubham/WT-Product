package com.wissen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long prodId;
	
	@Column
	private String prodName;
	
	@Column
	private double price;
	
	@Column
	private String description;
	
	@Column
	private String category;
	
	@Column
	private int quantity;
	
	
	public Product() {
		super();
	}
	public Long getProdId() {
		return prodId;
	}
	public void setProdId(Long prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product(Long prodId, String prodName, double price, String description, String category, int quantity) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.description = description;
		this.category = category;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", description="
				+ description + ", category=" + category + ", quantity=" + quantity + "]";
	}
	
	
	
	
}
