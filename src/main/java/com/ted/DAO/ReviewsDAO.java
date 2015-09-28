package com.ted.DAO;

import java.util.List;

import com.ted.Model.Reviews;

public interface ReviewsDAO {
	public void add(Reviews review);
	public List<Reviews> getAll();
	
	public void edit(Reviews review);
	//public void delete(String cam_mod);
}
