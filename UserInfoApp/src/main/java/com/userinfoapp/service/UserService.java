package com.userinfoapp.service;

import java.util.List;

import com.userinfoapp.model.User;

public interface UserService {
	public User saveUserData(User user);

	public User updateUserData(User user);

	public void deleteUserData(int uId);

	public List<User> findAllUserList();

	public User findByIdUserList(int uId);
	
	public boolean findByUserName(String userName);

}
