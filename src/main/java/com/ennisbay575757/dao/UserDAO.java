package com.ennisbay575757.dao;

import java.util.List;

import com.ennisbay575757.dao.GenericDAO;
import com.ennisbay575757.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


