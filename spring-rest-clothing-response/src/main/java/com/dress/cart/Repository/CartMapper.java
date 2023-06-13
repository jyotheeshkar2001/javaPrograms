package com.dress.cart.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dress.cart.Cart;

public class CartMapper implements RowMapper<Cart> {

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Cart cart=new Cart();
		cart.setName(rs.getString("name"));
		cart.setId(rs.getInt("id"));
		cart.setColour(rs.getString("colour"));
		cart.setBrand(rs.getString("brand"));
		cart.setType(rs.getString("type"));
		cart.setSize(rs.getString("dresssize"));
		cart.setCategory(rs.getString("category"));
		cart.setPrice(rs.getDouble("price"));
	  
		return cart;
	}
	
	

}
