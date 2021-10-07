package com.wissen.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wissen.entity.Product;

public interface ProductDAO extends JpaRepository<Product, Long> {

}
