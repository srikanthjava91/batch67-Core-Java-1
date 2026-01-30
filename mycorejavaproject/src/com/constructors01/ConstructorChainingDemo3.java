package com.constructors01;

class Person1 {
	String name;

	// Parent class constructor
	Person1(String name) {
		this.name = name;
		System.out.println("Parent class constructor called: " + name);
	}
}

// Child class
class Employee extends Person1 {
	int id;

	// Child class constructor
	Employee(String name, int id) {
		super(name); // Calls parent constructor
		this.id = id;
		System.out.println("Child class constructor called: " + id);
	}
}

// Main class
public class ConstructorChainingDemo3 {
	public static void main(String[] args) {
		System.out.println("main method started !");
		Employee emp = new Employee("Srikanth", 101);
	}
}