package com.dress.cart.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dress.cart.Cart;
import com.dress.cart.CartDTO;

@Repository
public class CartRepositoryImpl implements CartRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addToCart(Cart cart) {
		
		String sql="insert into cart(cartId,id,userId) values(?,?,?)";
		
		jdbcTemplate.update(sql,cart.getCartId(),cart.getId(),cart.getUserId());
		
		
		
		
		
		
		
	}

	@Override
	public void removeFromCart(int cartId) {
		String sql="delete from cart where cartId=?";
		jdbcTemplate.update(sql,cartId);
		
	}

	@Override
	public List<Cart> listCartItems(String userId) {
		
		String sql="select d.name,d.id,d.colour,d.brand,d.type,d.category,d.price,d.dresssize from dress d,cart c  where d.id=c.cartId";
		return jdbcTemplate.query(sql, new CartMapper());
	}
	
	

	
	
	}
	
	
	
	


