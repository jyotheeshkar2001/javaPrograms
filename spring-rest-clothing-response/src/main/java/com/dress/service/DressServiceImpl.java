package com.dress.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dress.exceptions.DressNotFoundException;
import com.dress.model.Dress;
import com.dress.repository.IDressRepository;
@Service
public class DressServiceImpl implements IDressService {
	
	@Autowired
	IDressRepository dressRepository;

	@Override
	public void addDress(Dress dress) {
		dressRepository.addDress(dress);
		
	}

	@Override
	public void updateDress(int id, double price) {
		dressRepository.updateDress(id, price);
		
	}

	@Override
	public void deleteDress(int id) {
		dressRepository.deleteDress(id);
		
	}

	@Override
	public List<Dress> getAll() {
		
		return dressRepository.findAll();
	}

	@Override
	public Dress getById(int id) throws DressNotFoundException {
		Dress dress=dressRepository.findById(id)
				.orElseThrow(()->new DressNotFoundException("no dress"));
		return dress;
	}

	@Override
	public List<Dress> getByCategory(String category) throws DressNotFoundException {
		List<Dress> dresses=dressRepository.findByCategory(category);
		if(dresses.isEmpty())
			throw new DressNotFoundException("no dress in this category");
		return dresses;
	}

	@Override
	public List<Dress> getByPriceLessThan(double price) throws DressNotFoundException {
		List<Dress> dresses=dressRepository.findByPriceLessThan(price);
		if(dresses.isEmpty())
			throw new DressNotFoundException("no dress with in this price");
		return dresses;
		
	}

	@Override
	public List<Dress> getByNameContaining(String name, String category) throws DressNotFoundException {
		List<Dress> dresses=dressRepository.findByNameContaining(name,category);
		if(dresses.isEmpty())
			throw new DressNotFoundException("no dress with this name");
		return dresses;
		
	}

	@Override
	public List<Dress> getByBrandStarting(String brand) throws DressNotFoundException {
		List<Dress> dresses=dressRepository.findByBrandStarting(brand);
		if(dresses.isEmpty())
			throw new DressNotFoundException("no dress with in this brand");
		return dresses;
		
	
	}

}
