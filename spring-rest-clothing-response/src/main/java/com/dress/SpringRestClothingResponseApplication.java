package com.dress;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dress.user.UserDT;
import com.dress.user.service.UserService;
import com.dress.user.util.CSVHelper;

@SpringBootApplication
public class SpringRestClothingResponseApplication implements CommandLineRunner {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CSVHelper csvHelper;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestClothingResponseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<UserDT> usersDtos=csvHelper.getUserDTList("users.csv");
//
//     usersDtos.stream().forEach(usersDto->userService.addUser(usersDto));
//		
	}

}
