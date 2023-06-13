package com.dress.user.service;

import java.util.List;
import java.util.Optional;

import com.dress.model.Dress;
import com.dress.user.User;
import com.dress.user.UserDT;
import com.dress.user.exceptions.UserNotFoundException;

public interface UserService {

	public User addUser(User user);
	
	public User addUser(UserDT userDt);

	String generateUid(User user);

	public List<User> getAll();

	public User getByUid(String uid) throws UserNotFoundException;

	public int generatePassword();

	void updateUser(String uid, int password);
	
	void deleteUser(String uid);
	
	public User login(String email,int password);

}
