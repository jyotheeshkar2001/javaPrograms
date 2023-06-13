package com.dress.cart.Service;

import java.util.List;

import com.dress.cart.Cart;
import com.dress.cart.CartDTO;
import com.dress.model.Dress;

public interface CartService {
	
	void addToCart(Cart cart);
	
	void removeFromCart(int cartId);
	
	List<CartDTO> listCartItems(String userId);

}
