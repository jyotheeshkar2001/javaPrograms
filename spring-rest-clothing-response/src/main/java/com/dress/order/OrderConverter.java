package com.dress.order;

import org.springframework.stereotype.Component;

@Component
public class OrderConverter {
  public OrderDTO toDto(Order order)
  {
	  OrderDTO orderDto=new OrderDTO();
	  

		orderDto.setName(order.getName());

		orderDto.setId(order.getId());

		orderDto.setBrand(order.getBrand());
		orderDto.setCategory(order.getCategory());

		orderDto.setColour(order.getColour());
		orderDto.setType(order.getType());
		orderDto.setPrice(order.getPrice());
		orderDto.setSize(order.getSize());
		return orderDto;
  }
}
