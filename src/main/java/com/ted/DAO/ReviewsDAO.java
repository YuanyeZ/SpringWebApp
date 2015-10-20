package com.ted.DAO;

import java.util.List;

import com.ted.Model.Reviews;

public interface ReviewsDAO {
	public void add(Reviews review);
	public List<Reviews> getAllReviews();
	public void edit(Reviews review);
	
	//public List<String> getReviewsByCamera(String model);
	//public void delete(String cam_mod);
}
