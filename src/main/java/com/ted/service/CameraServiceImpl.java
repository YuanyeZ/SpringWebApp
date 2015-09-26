package com.ted.service;

import java.util.List;

import javax.transaction.Transactional;

import com.ted.DAO.CameraDAO;
import com.ted.Model.Camera;

public class CameraServiceImpl implements CameraService {
	
	private CameraDAO cameraDAO;
	
	public void setCameraDAO(CameraDAO cameraDAO) {
		this.cameraDAO = cameraDAO;
	}

	@Override
	@Transactional
	public void addCamera(Camera cam) {
		this.cameraDAO.add(cam);

	}

	@Override
	@Transactional
	public void updateCamera(Camera cam) {
		this.cameraDAO.update(cam);

	}

	@Override
	@Transactional
	public void deleteCamera(String model) {
		this.cameraDAO.delete(model);

	}

	@Override
	@Transactional
	public Camera getCameraByModel(String model) {
		return this.cameraDAO.getCamByModel(model);
	}

	@Override
	@Transactional
	public List<Camera> getAllUsers() {
		return this.cameraDAO.getAllCams();
	}

}
