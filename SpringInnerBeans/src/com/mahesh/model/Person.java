package com.mahesh.model;

public class Person {

	private Employee employee;
	private Manager manager;
	private Car car;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Person [employee=" + employee.getEmpname() + ", manager=" + manager.getNameofmanager() + ", car="
				+ car.getCarname() + "]";
	}

}
