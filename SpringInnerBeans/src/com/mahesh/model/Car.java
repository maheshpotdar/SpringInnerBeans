package com.mahesh.model;

public class Car {
	// primitive variable object malacha tayar karav lagnar.
	private String carname;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	@Override
	public String toString() {
		return "Car [carname=" + carname + "]";
	}

}
