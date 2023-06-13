package com.dress.cart.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dress.cart.Cart;
import com.dress.cart.CartDTO;
import com.dress.cart.Service.CartService;
import com.dress.user.User;
import com.dress.user.UserDTO;
@RestController
@RequestMapping("/cart-api")

public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/cartitems")
	ResponseEntity<Void> addToCart(@RequestBody Cart cart) {
		cartService.addToCart(cart);
		
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding items");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
	}
	
	@GetMapping("/cartitems/userId/{userId}")
	ResponseEntity<List<CartDTO>> listCartItems(@PathVariable("userId") String userId){
		List<CartDTO> cartDto=cartService.listCartItems(userId);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding items");
		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(cartDto);
	}
	
	@DeleteMapping("cartitems/cartId/{cartId}")

    ResponseEntity<Void> removeFromCart(@PathVariable("cartId") int cartId){

        cartService.removeFromCart(cartId);

        HttpHeaders httpHeaders=new HttpHeaders();

        httpHeaders.add("info", "removing dresses from cart");

        return ResponseEntity.status(HttpStatus.ACCEPTED).headers(httpHeaders).build();
	
	

}
}
