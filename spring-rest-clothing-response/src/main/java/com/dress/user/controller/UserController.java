package com.dress.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dress.user.User;
import com.dress.user.UserConverter;
import com.dress.user.UserDTO;
import com.dress.user.service.UserService;

@RestController
@RequestMapping("/user-api")
public class UserController {

	@Autowired
	private UserConverter userConverter;
	private UserService userService;

	public UserController(UserService userService) {
		super();
		this.userService = userService;
	}

	@PostMapping("/users")
	ResponseEntity<UserDTO> addUser(@RequestBody User user) {
		User userDetails=userService.addUser(user);
		UserDTO userDto=userConverter.toDto(userDetails);
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "adding user");
		return ResponseEntity.status(HttpStatus.CREATED).headers(httpHeaders).body(userDto);
	}

	@GetMapping("/users")
	ResponseEntity<List<User>> getAll() {

		List<User> users = userService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("info", "returning all users");
		headers.add("desc", "users from database");
		ResponseEntity<List<User>> responseEntity = new ResponseEntity<List<User>>(users, headers, HttpStatus.OK);

		return responseEntity;
	}

	@GetMapping("/users/uid/{uid}")
	ResponseEntity<User> getById(@PathVariable("uid") String uid) {
		User user = userService.getByUid(uid);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "returning one book by id");

		return ResponseEntity.status(HttpStatus.OK).headers(httpHeaders).body(user);

	}

	@PatchMapping("/users/uid/{uid}/password/{password}")
	ResponseEntity<Void> updateUser(@PathVariable("uid") String uid, @PathVariable("password") int password) {

		userService.updateUser(uid, password);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "update user");
		return ResponseEntity.accepted().build();

	}

	@DeleteMapping("/users/uid/{uid}")
	ResponseEntity<Void> deleteUser(@PathVariable("uid") String uid) {
		userService.deleteUser(uid);
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("info", "delete users");
		return ResponseEntity.accepted().build();

	}

	@GetMapping("/users/email/{email}/password/{password}")
	ResponseEntity<String> login(@PathVariable("email") String email, @PathVariable("password") int password) {
		
		User user=userService.login(email, password);
		HttpHeaders httpHeaders = new HttpHeaders();
		ResponseEntity responseEntity;
		if(user!=null) {
		httpHeaders.add("info", "login successfully");
		
		
		responseEntity= ResponseEntity.accepted().headers(httpHeaders).body("logged successfully");
		}
		else {
			httpHeaders.add("info", "invalid user");
		responseEntity= ResponseEntity.accepted().headers(httpHeaders).body("invalid user");
		}
		return responseEntity;
		

	}

}
