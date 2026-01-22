package com.dcl.cms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

	@Id
	@Column(name = "car_id", nullable = false, unique = false)
	private int CarId;

	@Column(name = "Model", nullable = false)
	private String Model;

	@Column(name = "Brand", nullable = false)
	private String brand;

	@Column(name = "Color", nullable = false)
	private String color;

	@Column(name = "Price", nullable = false)

	private int price;

	public int getCarId() {
		return CarId;
	}

	public void setCarId(int carId) {
		CarId = carId;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [CarId=" + CarId + ", Model=" + Model + ", brand=" + brand + ", color=" + color + ", price=" + price
				+ "]";
	}

}
