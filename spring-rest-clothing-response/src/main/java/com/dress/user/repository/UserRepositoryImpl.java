package com.dress.user.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dress.exceptions.DressNotFoundException;
import com.dress.user.User;
@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	

	@Override
	public User addUser(User user) {
		String sql="insert into users(firstName,middleName,lastName,dateOfBirth,city,email,favouritecricketer,userid,password) values(?,?,?,?,?,?,?,?,?)";
		Object[] arry= {user.getFirstName(),user.getMiddleName(),user.getLastName(),user.getDateOfBirth(),user.getCity(),user.getEmail(),user.getFavouritecricketer(),user.getUid(),user.getPassword()};
		jdbcTemplate.update(sql,arry);
		return user;
		
	}
	
	public List<User> findAll()
	{
		String sql="select * from users";
		return jdbcTemplate.query(sql,new UserMapper());
	}

	
	
	
	@Override
	public User findByUid(String uid) {
		
		String sql="select * from users where userId=?";
		try {
			User user1= jdbcTemplate.queryForObject(sql,new UserMapper(),uid);
					return user1;
			}catch(Exception e)
			{
				return null;
			}
	}

	@Override
	public void updateUser(String uid, int password) {
		String sql="update users set password=? where userId=?";
		
		jdbcTemplate.update(sql,password,uid);
		
	}

	@Override
	public void deleteUser(String uid) {
		
		String sql="delete from users where userId=?";
		
		jdbcTemplate.update(sql,uid);
		
	}

	@Override
	public User login(String email, int password) {
		
		String sql="select * from users where email=? and password=?";
		User user=  jdbcTemplate.queryForObject(sql,new UserMapper(),email,password);
		
		return user;
	}
}


