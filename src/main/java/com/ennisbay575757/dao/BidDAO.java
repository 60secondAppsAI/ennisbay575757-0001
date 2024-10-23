package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


