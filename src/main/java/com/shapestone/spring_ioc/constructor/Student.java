package com.shapestone.spring_ioc.constructor;

public class Student {
	
	private String name;
	private int rollNumber;
	
	Student(String name, int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
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
		System.out.println("Hello: " + name + " with roll number :: " + rollNumber);
	}
}