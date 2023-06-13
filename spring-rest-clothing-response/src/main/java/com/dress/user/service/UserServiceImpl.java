package com.dress.user.service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dress.exceptions.DressNotFoundException;
import com.dress.model.Dress;
import com.dress.user.User;
import com.dress.user.UserConverter;
import com.dress.user.UserDT;
import com.dress.user.exceptions.UserNotFoundException;
import com.dress.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserConverter userConverter;
	
	User userDetails;
	
	int i=0;
	@Override
	public User addUser(User user) {
		String uid=generateUid(user);
		
		 if(userRepository.findByUid(uid)==null)
		 {
			 if(i>=9)
				 i=0;
			 int password=generatePassword();
			 uid=uid.substring(0,5)+(i++);
			 user.setUid(uid);
			 user.setPassword(password);
		userDetails=userRepository.addUser(user);
		 }
		 else {
			 if(i>=9)
				 i=0;
			 int password=generatePassword();
			 uid=uid.substring(0,5)+(i++);
			 user.setUid(uid);
			 user.setPassword(password);
			 userDetails= userRepository.addUser(user);
		 }
		
		return userDetails;
		
	}

	@Override
	public String generateUid(User user) {
		
		String firstName=user.getFirstName();
		String MiddleName=user.getMiddleName();
	if(MiddleName=="")
		{
			MiddleName="j";
		}
		String LastName=user.getLastName();
		String city=user.getCity();
	
		String uid= city.substring(0,2)+firstName.charAt(0)+MiddleName.charAt(0)+LastName.charAt(0);
		return uid;
	}
	
	@Override
	public List<User> getAll()
	{
		return userRepository.findAll();
	}

	@Override
	public User getByUid(String uid) {
		
		User user=userRepository.findByUid(uid);
				if(user==null)
				throw new UserNotFoundException("no user");
		return user;
	}

	@Override
	public int generatePassword() {
		int password=0;
		Random random=new Random();
		for(int i=0;i<=4;i++)
		{
			int n=random.nextInt(9);
			password=password*10+n;
			
		}
		
				
		
		
		
		
		
		return password;
	}

	@Override
	public void updateUser(String uid, int password) {
		userRepository.updateUser(uid, password);
		
	}

	@Override
	public void deleteUser(String uid) {
		
		userRepository.deleteUser(uid);
		
	}

	@Override
	public User login(String email, int password) {
		
		
		return userRepository.login(email,password);
	}

	@Override
	public User addUser(UserDT userDt) {
		User user=userConverter.toEntity(userDt);
		String uid=generateUid(user);
		
		 if(userRepository.findByUid(uid)==null)
		 {
			 if(i>=9)
				 i=0;
			 int password=generatePassword();
			 uid=uid.substring(0,5)+(i++);
			 user.setUid(uid);
			 user.setPassword(password);
		userDetails=userRepository.addUser(user);
		 }
		 else {
			 if(i>=9)
				 i=0;
			 int password=generatePassword();
			 uid=uid.substring(0,5)+(i++);
			 user.setUid(uid);
			 user.setPassword(password);
			 userDetails= userRepository.addUser(user);
		 }
		
		return userDetails;
		
		
	}

	

}
