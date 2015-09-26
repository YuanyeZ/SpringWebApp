package com.ted.DAO;

import java.util.List;

import com.ted.Model.User;

public interface UserDAO {
	public void add(User user);
	public void update(User user);
	public void delete(int id);
	public User getUser(int id);
	public List<User> getAllUsers();
}
