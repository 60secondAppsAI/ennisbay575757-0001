package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.Review;





public interface ReviewDAO extends GenericDAO<Review, Integer> {
  
	List<Review> findAll();
	






}


