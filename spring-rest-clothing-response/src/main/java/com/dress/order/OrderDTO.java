package com.dress.order;

public class OrderDTO {
	private String name;
	private int id;
	private String colour;
	private String brand;
	private String type;
	private String category;
	private double price;
	private String size;
	
	@Override
	public String toString() {
		return "OrderDTO [name=" + name + ", id=" + id + ", colour=" + colour + ", brand=" + brand + ", type=" + type
				+ ", category=" + category + ", price=" + price + ", size=" + size + "]";
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

	public OrderDTO(String name, int id, String colour, String brand, String type, String category, double price,
			String size) {
		super();
		this.name = name;
		this.id = id;
		this.colour = colour;
		this.brand = brand;
		this.type = type;
		this.category = category;
		this.price = price;
		this.size = size;
	}

	public OrderDTO() {
		super();
	}
}
