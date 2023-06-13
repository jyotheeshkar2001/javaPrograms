package com.dress.cart.Repository;

import java.util.List;
import java.util.Optional;

import com.dress.cart.Cart;
import com.dress.cart.CartDTO;
import com.dress.model.Dress;

public interface CartRepository {
    
      void addToCart(Cart cart);
	
	  void removeFromCart(int cartId);
	
	  List<Cart> listCartItems(String userId);
	  

}
