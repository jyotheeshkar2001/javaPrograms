package com.dress.cart;

import org.springframework.stereotype.Component;

import com.dress.model.Dress;

@Component
public class CartConverter {

	public CartDTO toDto(Cart cart) {
		CartDTO cartDto = new CartDTO();

		cartDto.setName(cart.getName());

		cartDto.setId(cart.getId());

		cartDto.setBrand(cart.getBrand());
		cartDto.setCategory(cart.getCategory());

		cartDto.setColour(cart.getColour());
		cartDto.setType(cart.getType());
		cartDto.setPrice(cart.getPrice());
		cartDto.setDressSize(cart.getSize());
		return cartDto;
	}
}
