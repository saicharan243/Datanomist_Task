package com.userinfoapp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userinfoapp.model.User;
import com.userinfoapp.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping
	public User add(@RequestBody User User) {
		return userService.saveUserData(User);
	}

	@PutMapping
	public User update(@RequestBody User User) {
		return userService.updateUserData(User);
	}

	@GetMapping
	public List<User> findAll() {
		return userService.findAllUserList();
	}

	@GetMapping("/{userId}")
	public User findById(@PathVariable("userId") int id) {
		System.out.println(id);
		return userService.findByIdUserList(id);
	}

	@DeleteMapping("/{userId}")
	public void deleteById(@PathVariable("userId") int id) {
		userService.deleteUserData(id);
	}

	@GetMapping(value = "/CheckUser/{userName}")
	public boolean CheckUsername(@PathVariable("userName") @Valid String username) {
		return userService.findByUserName(username);
	}
}
