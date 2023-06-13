package com.dress.order;

public class Order {
	private String name;
	private int id;
	private String colour;
	private String brand;
	private String type;
	private String category;
	private double price;
	private String size;
	private int orderId;
	public Order() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Order(String name, int id, String colour, String brand, String type, String category, double price,
			String size, int orderId, String userId) {
		super();
		this.name = name;
		this.id = id;
		this.colour = colour;
		this.brand = brand;
		this.type = type;
		this.category = category;
		this.price = price;
		this.size = size;
		this.orderId = orderId;
		this.userId = userId;
	}
	private String userId;

}
