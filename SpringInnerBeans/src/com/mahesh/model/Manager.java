package com.mahesh.model;

public class Manager {

	private String nameofmanager;
	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public String getNameofmanager() {
		return nameofmanager;
	}

	public void setNameofmanager(String nameofmanager) {
		this.nameofmanager = nameofmanager;
	}

	@Override
	public String toString() {
		return "Manager [nameofmanager=" + nameofmanager + ", car=" + car + "]";
	}

}
