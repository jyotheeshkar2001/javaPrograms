package com.dress.order.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dress.order.Order;
import com.dress.order.OrderDTO;

public class OrderMapper implements RowMapper<Order>{

	@Override
	public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
		
	Order order=new Order();
		  

		
		order.setName(rs.getString("name"));
		order.setId(rs.getInt("id"));
		order.setColour(rs.getString("colour"));
		order.setBrand(rs.getString("brand"));
		order.setType(rs.getString("type"));
		order.setSize(rs.getString("dsize"));
		order.setCategory(rs.getString("category"));
		order.setPrice(rs.getDouble("price"));

		
		
		return order;
	}

}
