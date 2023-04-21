package com.shapestone.spring_ioc;

public class Student {
	
	private String name;
	
	public Student() {
		System.out.println("Default constructor..");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void displayInfo() {
		System.out.println("Hello: " + name);
	}
}