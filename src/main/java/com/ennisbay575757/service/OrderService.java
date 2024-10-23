package com.ennisbay575757.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ennisbay575757.domain.Order;
import com.ennisbay575757.dto.OrderDTO;
import com.ennisbay575757.dto.OrderSearchDTO;
import com.ennisbay575757.dto.OrderPageDTO;
import com.ennisbay575757.dto.OrderConvertCriteriaDTO;
import com.ennisbay575757.service.GenericService;
import com.ennisbay575757.dto.common.RequestDTO;
import com.ennisbay575757.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OrderService extends GenericService<Order, Integer> {

	List<Order> findAll();

	ResultDTO addOrder(OrderDTO orderDTO, RequestDTO requestDTO);

	ResultDTO updateOrder(OrderDTO orderDTO, RequestDTO requestDTO);

    Page<Order> getAllOrders(Pageable pageable);

    Page<Order> getAllOrders(Specification<Order> spec, Pageable pageable);

	ResponseEntity<OrderPageDTO> getOrders(OrderSearchDTO orderSearchDTO);
	
	List<OrderDTO> convertOrdersToOrderDTOs(List<Order> orders, OrderConvertCriteriaDTO convertCriteria);

	OrderDTO getOrderDTOById(Integer orderId);







}




