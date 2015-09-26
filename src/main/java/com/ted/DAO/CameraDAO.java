package com.ted.DAO;

import java.util.List;

import com.ted.Model.Camera;;

public interface CameraDAO {
	public void add(Camera cam);
	public void update(Camera cam);
	public void delete(String model);
	public Camera getCamByModel(String model);
	public List<Camera> getAllCams();
}
