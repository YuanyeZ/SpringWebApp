package com.ted.service;

import java.util.List;

import com.ted.Model.Reviews;

public interface ReviewsService {

	public void addReview(Reviews review);
	public List<Reviews> getAllReviews();
	//public List<Reviews> getReviewsByCamera(String model);		
	public void editReview(Reviews review);
	
}
