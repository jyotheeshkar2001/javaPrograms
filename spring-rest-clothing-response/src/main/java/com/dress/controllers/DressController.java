package com.dress.controllers;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dress.model.Dress;
import com.dress.service.IDressService;

@RestController
@RequestMapping("/dress-api")
public class DressController {
	
	private IDressService dressService;

	public DressController(IDressService dressService) {
		super();
		this.dressService = dressService;
	}
	
	@PostMapping("/dresses")
	ResponseEntity<Void> addDress(@RequestBody Dress dress){
		dressService.addDress(dress);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info", "adding dress");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).build();
		
		
	}
	
	@PutMapping("/dresses")
	ResponseEntity<Void> updateAllDresses(@RequestBody Dress dress) {
		dressService.updateDress(dress.getId(),dress.getPrice());
		
		
		
		
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","update dresses");
		return ResponseEntity.accepted().build();
	}
	
	@PatchMapping("/dresses/id/{id}/price/{price}")
	ResponseEntity<Void> updateDress(@PathVariable("id")int id,@PathVariable("price") double price){
		
		dressService.updateDress(id, price);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","update dresses");
		return ResponseEntity.accepted().build();
		
	}
	
	@DeleteMapping("/dresses/id/{id}")
	ResponseEntity<Void> deleteDress(@PathVariable("id")int id) {
		dressService.deleteDress(id);
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.add("info","delete dresses");
		return ResponseEntity.accepted().build();
		
	}
	
	
		@GetMapping("/dresses")
		ResponseEntity<List<Dress>> getAll(){
	        
			List<Dress> dresses=dressService.getAll();
			HttpHeaders headers=new HttpHeaders();
			headers.add("info","returning all books");
			headers.add("desc", "books fro database");
			ResponseEntity<List<Dress>> responseEntity=new ResponseEntity<List<Dress>>(dresses,headers,HttpStatus.OK);
			
			return responseEntity;
		}
	
		@GetMapping("/dresses/id/{id}")
        ResponseEntity<Dress> getById(@PathVariable("id") int id) {
	Dress dress=dressService.getById(id);
	HttpHeaders httpHeaders=new HttpHeaders();
	httpHeaders.add("info", "returning one book by id");

	return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(dress);
	
	
}
		@GetMapping("/dresses/category/{category}")
		ResponseEntity<List<Dress>> getByCategory(@PathVariable("category") String Category) {
			List<Dress> dresses=dressService.getByCategory(Category);
			return ResponseEntity.ok(dresses);
		}
		
		@GetMapping("/dresses/price/{price}")
		ResponseEntity<List<Dress>> getByPriceLessThan(@PathVariable("price") double price) {
			List<Dress> dresses=dressService.getByPriceLessThan(price);
			HttpHeaders httpHeaders=new HttpHeaders();
			
			return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(dresses);
		}
		
		
		
		@GetMapping("/dresses/name/{name}/category/{category}")
		ResponseEntity<List<Dress>> getByNameContaining(@PathVariable("name") String name, @PathVariable("category") String category) {
		   List<Dress> dresses=dressService.getByNameContaining(name, category);
		   HttpHeaders httpHeaders=new HttpHeaders();
			return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(dresses);
		}
		
		@GetMapping("/dresses/brand")
		ResponseEntity<List<Dress>> getByBrandStarting(@RequestParam("brand") String brand) {
			List<Dress> dresses=dressService.getByBrandStarting(brand);
			HttpHeaders httpHeaders=new HttpHeaders();
			
			
			return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(dresses);
		}


	
	

}
