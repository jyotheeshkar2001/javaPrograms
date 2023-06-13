package com.dress.order.repository;

import java.util.List;

import com.dress.order.Order;

public interface OrderRepository {
	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> findAll(String userId);

}
