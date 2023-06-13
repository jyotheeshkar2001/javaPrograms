package com.dress.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dress.cart.Cart;
import com.dress.cart.CartDTO;
import com.dress.cart.Service.CartService;
import com.dress.order.Order;
import com.dress.order.OrderDTO;
import com.dress.order.service.OrderService;
@RestController
@RequestMapping("/order-api")
public class OrderController {
	


		
		@Autowired
		private OrderService orderService;
		
		@PostMapping("/orders")
		ResponseEntity<Void> addToCart(@RequestBody Order order) {
			orderService.addOrder(order);
			
			
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("info", "adding orders");
			return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		}
		
		@GetMapping("/orders/userId/{userId}")
		ResponseEntity<List<OrderDTO>> listCartItems(@PathVariable("userId") String userId){
			List<OrderDTO> orderDto=orderService.getAll(userId);
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("info", "adding items");
			return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(orderDto);
		}
		
		
		
		
		

	}



