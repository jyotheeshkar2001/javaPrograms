package com.dress.order.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dress.cart.Cart;
import com.dress.order.Order;
import com.dress.order.OrderConverter;
import com.dress.order.OrderDTO;
import com.dress.order.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderConverter orderConverter;
	@Override
	public void addOrder(Order order) {
		
		orderRepository.addOrder(order);
	}

	@Override
	public void deleteOrder(int orderId) {
		
		orderRepository.deleteOrder(orderId);
	}

	@Override
	public List<OrderDTO> getAll(String userId) {
		List<Order> orders=orderRepository.findAll( userId);
		return orders.stream().map((cart)->orderConverter.toDto(cart)).collect(Collectors.toList());
		
	}

}
