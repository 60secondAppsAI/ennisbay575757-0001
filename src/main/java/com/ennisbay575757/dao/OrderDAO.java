package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.Order;





public interface OrderDAO extends GenericDAO<Order, Integer> {
  
	List<Order> findAll();
	






}


