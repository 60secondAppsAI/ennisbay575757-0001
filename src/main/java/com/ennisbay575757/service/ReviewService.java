package com.ennisbay575757.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ennisbay575757.domain.Review;
import com.ennisbay575757.dto.ReviewDTO;
import com.ennisbay575757.dto.ReviewSearchDTO;
import com.ennisbay575757.dto.ReviewPageDTO;
import com.ennisbay575757.dto.ReviewConvertCriteriaDTO;
import com.ennisbay575757.service.GenericService;
import com.ennisbay575757.dto.common.RequestDTO;
import com.ennisbay575757.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface ReviewService extends GenericService<Review, Integer> {

	List<Review> findAll();

	ResultDTO addReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

	ResultDTO updateReview(ReviewDTO reviewDTO, RequestDTO requestDTO);

    Page<Review> getAllReviews(Pageable pageable);

    Page<Review> getAllReviews(Specification<Review> spec, Pageable pageable);

	ResponseEntity<ReviewPageDTO> getReviews(ReviewSearchDTO reviewSearchDTO);
	
	List<ReviewDTO> convertReviewsToReviewDTOs(List<Review> reviews, ReviewConvertCriteriaDTO convertCriteria);

	ReviewDTO getReviewDTOById(Integer reviewId);







}





