package com.ennisbay575757.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ennisbay575757.domain.Product;
import com.ennisbay575757.dto.ProductDTO;
import com.ennisbay575757.dto.ProductSearchDTO;
import com.ennisbay575757.dto.ProductPageDTO;
import com.ennisbay575757.dto.ProductConvertCriteriaDTO;
import com.ennisbay575757.service.GenericService;
import com.ennisbay575757.dto.common.RequestDTO;
import com.ennisbay575757.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ProductService extends GenericService<Product, Integer> {

	List<Product> findAll();

	ResultDTO addProduct(ProductDTO productDTO, RequestDTO requestDTO);

	ResultDTO updateProduct(ProductDTO productDTO, RequestDTO requestDTO);

    Page<Product> getAllProducts(Pageable pageable);

    Page<Product> getAllProducts(Specification<Product> spec, Pageable pageable);

	ResponseEntity<ProductPageDTO> getProducts(ProductSearchDTO productSearchDTO);
	
	List<ProductDTO> convertProductsToProductDTOs(List<Product> products, ProductConvertCriteriaDTO convertCriteria);

	ProductDTO getProductDTOById(Integer productId);







}




