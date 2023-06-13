package com.dress.order.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dress.order.Order;

@Repository
public class OrderRepositoryImpl implements OrderRepository{
	
	@Autowired 
	private JdbcTemplate jdbcTemplate;

	@Override
	public void addOrder(Order order) {
		String sql="insert into orders(orderId,id,userId) values(?,?,?)";
		jdbcTemplate.update(sql,order.getOrderId(),order.getId(),order.getUserId());
		
		
	}
	

	@Override
	public void deleteOrder(int orderId) {
		String sql="delete from orders where orderId=?";
		jdbcTemplate.update(sql,orderId);
		
	}
	

	@Override
	public List<Order> findAll(String userId) {
		String sql=" select * from dress d,orders o where d.id=o.orderId and o.userId=?";
		return jdbcTemplate.query(sql, new OrderMapper(),userId);
	}

}
