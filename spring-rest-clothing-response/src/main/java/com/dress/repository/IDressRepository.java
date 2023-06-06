package com.dress.repository;

import java.util.List;
import java.util.Optional;

import com.dress.model.Dress;

public interface IDressRepository {
	
	void addDress(Dress dress);
	void updateDress(int id,double price);
	void deleteDress(int id);
	
	List<Dress> findAll();
	Optional<Dress> findById(int id)  ;
	List<Dress> findByCategory(String category)  ;
	List<Dress> findByPriceLessThan(double price) ;
	List<Dress> findByNameContaining (String name,String category)  ;
	List<Dress> findByBrandStarting(String brand)  ;
	

}
