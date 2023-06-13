package com.dress.cart.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dress.cart.Cart;
import com.dress.cart.CartConverter;
import com.dress.cart.CartDTO;
import com.dress.cart.Repository.CartRepository;
import com.dress.exceptions.DressNotFoundException;
import com.dress.model.Dress;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	@Autowired
	private CartConverter cartConverter;
	

	@Override
	public void addToCart(Cart cart) {
		
		
		cartRepository.addToCart(cart);
		
		
	}

	@Override
	public void removeFromCart(int cartId) {
		
		cartRepository.removeFromCart(cartId);
	}

	@Override
	public List<CartDTO> listCartItems(String userId) {
		
		List<Cart> carts=cartRepository.listCartItems( userId);
		return carts.stream().map((cart)->cartConverter.toDto(cart)).collect(Collectors.toList());
	}
	
	
	
	
	

}
