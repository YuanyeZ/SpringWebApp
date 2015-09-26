package com.ted.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.ted.DAO.UserDAO;
import com.ted.Model.User;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDAO userDAO;
	
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	@Transactional
	public void addUser(User user) {
		this.userDAO.add(user);		
	}

	@Override
	@Transactional
	public void updateUser(User user) {
		this.userDAO.update(user);		
	}

	@Override
	@Transactional
	public void deleteUser(int id) {
		this.userDAO.delete(id);		
	}
	
	@Override
	@Transactional
	public User getUserById(int id) {
		return this.userDAO.getUser(id);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return this.userDAO.getAllUsers();
	}

}
