package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.Product;





public interface ProductDAO extends GenericDAO<Product, Integer> {
  
	List<Product> findAll();
	






}


