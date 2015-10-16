package com.ted.service;

import java.util.List;

import com.ted.Model.Camera;

public interface CameraService {
	public void addCamera(Camera cam);
	public void updateCamera(Camera cam);
	public void deleteCamera(String model);
	public Camera getCameraByModel(String model);
	public List<Camera> getAllCameras();
}
