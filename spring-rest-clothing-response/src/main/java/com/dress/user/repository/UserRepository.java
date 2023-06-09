package com.dress.user.repository;

import java.util.List;
import java.util.Optional;

import com.dress.user.User;

public interface UserRepository {
	
	//boolean doesUserExist(String uid);
	
	void addUser(User user);
	
	public User findByUid(String uid);
	
	public List<User> findAll();
	
	void updateUser(String uid, String city);
	
	void deleteUser(String uid);
	
	

}
