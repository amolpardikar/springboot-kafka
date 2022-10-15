package com.example.demo.model;

public record User(String name, String dept, Long salary) {


	public User(String name, String dept, Long salary) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

}
