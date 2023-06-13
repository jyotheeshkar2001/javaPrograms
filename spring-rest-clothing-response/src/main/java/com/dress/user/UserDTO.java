package com.dress.user;

public class UserDTO {

	private String email;
	private int password;

	public UserDTO() {
		super();
	}

	public  UserDTO(String email, int password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserDTO [email=" + email + ", password=" + password + "]";
	}

}
