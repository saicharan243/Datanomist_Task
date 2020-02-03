package com.userinfoapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "UserDetails")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
	@Id
	@GenericGenerator(name = "myGen", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "myGen")
	private Integer userId;
	private String firstName;
	private String lastName;
	@Column(unique=true)
	private String userName;
	private String password;
	private String gender;
	private int acceptPolicy;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAcceptPolicy() {
		return acceptPolicy;
	}
	public void setAcceptPolicy(int acceptPolicy) {
		this.acceptPolicy = acceptPolicy;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", gender=" + gender + ", acceptPolicy=" + acceptPolicy + "]";
	}
	public User(Integer userId, String firstName, String lastName, String userName, String password, String gender,
			int acceptPolicy) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.gender = gender;
		this.acceptPolicy = acceptPolicy;
	}
	public User() {
		super();
	}


}
