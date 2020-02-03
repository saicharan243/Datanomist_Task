package com.userinfoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userinfoapp.dao.UserDao;
import com.userinfoapp.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User saveUserData(User user) {
		return userDao.save(user);
	}

	@Override
	public User updateUserData(User user) {
		return userDao.save(user);
	}

	@Override
	public void deleteUserData(int uId) {
		userDao.deleteById(uId);

	}

	@Override
	public List<User> findAllUserList() {
		return userDao.findAll();
	}

	@Override
	public User findByIdUserList(int uId) {
		return userDao.getOne(uId);
	}

	@Override
	public boolean findByUserName(String userName) {
		boolean isvaild = false;
		User user = userDao.findByUserName(userName);
		if (user != null) {
			if (userName.equals(user.getUserName())) {
				isvaild = true;
				System.out.println("................." + isvaild);
			}
		}
		return isvaild;
	}
}
