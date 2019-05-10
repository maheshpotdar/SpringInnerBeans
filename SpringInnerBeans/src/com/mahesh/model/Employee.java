package com.mahesh.model;

public class Employee {

	// 2 primitive ani 1 secondary variable.
	// class madhe 1 jari primitive variable asel tar object malacha tayara karav
	// lagnar.

	private String empname;

	private Car car;
	private TwoWheeler twoWheeler;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public TwoWheeler getTwoWheeler() {
		return twoWheeler;
	}

	public void setTwoWheeler(TwoWheeler twoWheeler) {
		System.out.println("setterrrrrrrrrrrrr Inject ...");
		this.twoWheeler = twoWheeler;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Employee [empname=" + empname + ", car=" + car + ", twoWheeler=" + twoWheeler + "]";
	}

}
