package com.dress.user;

import com.opencsv.bean.CsvBindByPosition;

public class UserDT {
	@CsvBindByPosition(position=0)
	private String firstName;
	@CsvBindByPosition(position=1)
	private String middleName;
	@CsvBindByPosition(position=2)
	private String lastName;
	@CsvBindByPosition(position=3)
	private String dateOfBirth;
	@CsvBindByPosition(position=4)
	private String city;
	@CsvBindByPosition(position=5)
	private String email;
	@CsvBindByPosition(position=6)
	private String favouritecricketer;
	private String uid;
	private int password;
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
	public UserDT(String firstName, String middleName, String lastName, String dateOfBirth, String city, String email,
			String favouritecricketer) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.city = city;
		this.email = email;
		this.favouritecricketer = favouritecricketer;
		
	}
	@Override
	public String toString() {
		return "UserDT [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", city=" + city + ", email=" + email + ", favouritecricketer="
				+ favouritecricketer + ", uid=" + uid + ", password=" + password + "]";
	}
	public UserDT() {
		super();
	}

}
