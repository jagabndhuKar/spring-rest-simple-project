package com.jka.java.rest.app.JavaRestApp.entety;

public class Corces {

	private long id;
	private String name;
	private double price;

	public Corces() {
		super();
	}

	public Corces(long id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Corces [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
}
