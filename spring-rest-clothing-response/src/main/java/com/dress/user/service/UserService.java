package com.dress.user.service;

import java.util.List;
import java.util.Optional;

import com.dress.model.Dress;
import com.dress.user.User;

public interface UserService {

	public void addUser(User user);

	String generateUid(User user);

	public List<User> getAll();

	public User getByUid(String uid);

	public int generatePassword();

	void updateUser(String uid, String city);
	
	void deleteUser(String uid);

}
