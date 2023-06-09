package com.dress.user.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dress.user.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		User user=new User();
		user.setFirstName(rs.getString("firstName"));
		user.setMiddleName(rs.getString("middleName"));
		user.setLastName(rs.getString("lastName"));
		user.setEmail(rs.getString("email"));
		user.setCity(rs.getString("city"));
		user.setDateOfBirth(rs.getString("dateOfBirth"));
		user.setSecurityQuestion(rs.getString("securityQuestion"));
		user.setUid(rs.getString("userid"));
		user.setPassword(rs.getInt("password"));
		
		
		return user;
	}
	
	

}
