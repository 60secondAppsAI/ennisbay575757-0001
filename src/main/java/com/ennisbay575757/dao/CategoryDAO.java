package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


