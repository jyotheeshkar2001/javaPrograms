package com.dress.order.service;

import java.util.List;

import com.dress.order.Order;
import com.dress.order.OrderDTO;

public interface OrderService {
	void addOrder(Order order);
	void deleteOrder(int orderId);
	List<OrderDTO> getAll(String userId);

}
