package com.userinfoapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.userinfoapp.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
	public User findByUserName(String userName);

}
