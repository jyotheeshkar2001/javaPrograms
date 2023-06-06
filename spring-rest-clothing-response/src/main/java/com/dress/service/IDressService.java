package com.dress.service;

import java.util.List;

import com.dress.exceptions.DressNotFoundException;
import com.dress.model.Dress;

//import com.clothing.model.Clothing;

public interface IDressService {
	
	void addDress(Dress dress);
	void updateDress(int id,double price);
	void deleteDress(int id);
	
	List<Dress> getAll();
	Dress getById(int id) throws DressNotFoundException;
	List<Dress> getByCategory(String category) throws DressNotFoundException;
	List<Dress> getByPriceLessThan(double price)throws DressNotFoundException;
	List<Dress> getByNameContaining (String name,String category) throws DressNotFoundException;
	List<Dress> getByBrandStarting(String brand) throws DressNotFoundException;
	
	
	

}
