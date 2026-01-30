package com.constructors01;

public class Person {
	String name;
	int sid;
	int age;

	public Person() {
		System.out.println("no arg constructor from Person !");
	}

	public Person(String name, int sid, int age) {
		this.name = name;
		this.sid = sid;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Person!!");
	}
}

class Student1 extends Person {

	public static void main(String[] args) {
		System.out.println("main method started from STudent1 !!!");

		Student1 s1 = new Student1();

	}
}
