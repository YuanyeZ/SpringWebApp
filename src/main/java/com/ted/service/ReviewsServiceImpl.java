package com.ted.service;

import java.util.List;

import javax.transaction.Transactional;

import com.ted.DAO.ReviewsDAO;
import com.ted.Model.Reviews;

public class ReviewsServiceImpl implements ReviewsService {

	private ReviewsDAO reviewsDAO;
		
	public void setReviewsDAO(ReviewsDAO reviewsDAO) {
		this.reviewsDAO = reviewsDAO;
	}

	@Override
	@Transactional
	public void addReview(Reviews review) {
		this.reviewsDAO.add(review);
	}

	@Override
	@Transactional
	public  List<Reviews> getAllReviews() {
		return this.reviewsDAO.getAllReviews();
	}

	@Override
	@Transactional
	public void editReview(Reviews review) {
		this.reviewsDAO.edit(review);
	}

//	@Override
//	public List<Reviews> getReviewsByCamera(String model) {
//		return this.reviewsDAO.getReviewsByCamera(model);
//	}

}
