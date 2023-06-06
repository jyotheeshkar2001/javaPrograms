package com.restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.shristi.auto.FoodFactory;

@SpringBootApplication(scanBasePackages = "com.shristi.auto")

public class SpringRestaurantappApplication implements CommandLineRunner {

	
	FoodFactory foodFactory;
	@Autowired
	
	public void setFoodFactory(FoodFactory foodFactory) {
	
		this.foodFactory = foodFactory;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringRestaurantappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(foodFactory.displayMenu("chinese"));
	}

}
