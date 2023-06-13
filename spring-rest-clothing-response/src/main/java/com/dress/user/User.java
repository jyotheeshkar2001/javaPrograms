package com.dress.user;

public class User {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String dateOfBirth;
	private String city;
	private String email;
	private String favouritecricketer;
	private String uid;
	private int password;
	
	
	public User(String firstName, String middleName, String lastName, String dateOfBirth, String city, String email,
			String favouritecricketer, String uid, int password) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.email = email;
		this.favouritecricketer = favouritecricketer;
		this.uid = uid;
		this.password = password;
	}
	public User() {
		super();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public String getFavouritecricketer() {
		return favouritecricketer;
	}
	public void setFavouritecricketer(String favouritecricketer) {
		this.favouritecricketer = favouritecricketer;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", email=" + email + ", favouriteCricketer="
				+ favouritecricketer + ", uid=" + uid + ", password=" + password + "]";
	}
	

}
