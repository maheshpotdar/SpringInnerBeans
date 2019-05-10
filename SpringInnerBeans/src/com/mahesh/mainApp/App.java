package com.mahesh.mainApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Employee;
import com.mahesh.model.Person;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = context.getBean("p1", Person.class);
		Employee employee = context.getBean("empa", Employee.class);

		System.out.println("Emp name: " + employee.getEmpname());
		System.out.println("TwoWheeler Name: " + employee.getTwoWheeler().getNameof2Wheeler() + "\n Employee Avg: "
				+ employee.getTwoWheeler().getAvg());
	}

}
