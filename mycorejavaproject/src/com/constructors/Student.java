package com.constructors;

public class Student {

	// instance data
	int sid;
	String sname;
	int age;

	// no-arg constructor
	Student() {
		System.out.println("no arg constructor called ");
		sid = 1;
		sname = "Unknown";
		age = 20;
	}

	// instance data, we can access in instance methods directly.
	void show() {
		// Representing the data
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(age);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

//		Creating the below object with the help of no arg constructor 
//		when your class contain no-arg constructor.

//		 Creating the below object with the help of default constructor 
//		whenever your class does not contain any constructor.

		System.out.println("Object1 info ");
		Student s1 = new Student();

		// Assigning the data into instance variables
		s1.sid = 101;
		s1.sname = "Rahul";
		s1.age = 21;
		s1.show();

		System.out.println("Object2 info !");
		Student s2 = new Student();
		s2.show();

		System.out.println("main method ended !");
	}
}
