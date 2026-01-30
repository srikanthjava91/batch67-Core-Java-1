package com.constructors01;

class Student {
	String name;
	int age;
	String course;

	// Constructor 1
	Student() {
		System.out.println("no arg constructor called");
		this("Unknown", 18); // calling parameterized constructor
	}

	// Constructor 2
	Student(String name, int age) {
		System.out.println("Constructor with 2 parameters called");
		this(name, age, "Java"); // calling another constructor
	}

	// Constructor 3
	Student(String name, int age, String course) {
		this.name = name;
		this.age = age;
		this.course = course;
		System.out.println("Constructor with 3 parameters called");
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
	}
}

public class ConstructorChainingDemo {
	public static void main(String[] args) {
		System.out.println("main method started ");
//		Student s1 = new Student(); // starts chaining
//		s1.display();

		Student s2 = new Student("Kohli", 36);
		s2.display();
	}
}
