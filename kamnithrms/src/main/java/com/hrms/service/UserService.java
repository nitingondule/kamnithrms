package com.hrms.service;

import com.hrms.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
