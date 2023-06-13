package com.dress.user;

import org.springframework.stereotype.Component;

@Component
public class UserConverter {
	
	public UserDTO toDto(User user)
	{
		UserDTO userDto=new UserDTO();
		
		userDto.setEmail(user.getEmail());
		userDto.setPassword(user.getPassword());
		
		return userDto;
	}
	
	public User toEntity(UserDT userDt) {
		User user=new User();
		user.setFirstName(userDt.getFirstName());
		user.setMiddleName(userDt.getMiddleName());
		user.setLastName(userDt.getLastName());
		user.setDateOfBirth(userDt.getDateOfBirth());
		user.setCity(userDt.getCity());
		user.setEmail(userDt.getEmail());
		user.setFavouritecricketer(userDt.getFavouritecricketer());
		return user;
		
	}
	

}
