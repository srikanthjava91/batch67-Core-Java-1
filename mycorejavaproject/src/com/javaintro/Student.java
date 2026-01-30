package com.javaintro;

public class Student {

	// instance method
	void hello() {
		System.out.println("Hello Guys, Good evening !!");
	}

	// static main method : entry point of java programming
	// without main method, we cannot execute java program.
	public static void main(String[] args) {
		System.out.println("main method started !");

		Student s1 = new Student();

		// Calling the static method
		welcome();

		// Calling the instance method
		s1.hello();

		System.out.println("main method ended !");
	}

	// static method
	static void welcome() {
		System.out.println("Welcome to Java world !!");
	}

}
