package com.constructors01;

//super()
public class Animal {
	String name;
	int age;

	Animal(String name, int age) {
		System.out.println("parameterized arg constructor called from Aniaml");
		this.name = name;
		this.age = age;
	}

	Animal() {
		System.out.println("no arg constructor from Animal ");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal");
	}
}

//Note : By default every constructor in Java will call super() without fail, 
//if we are not calling any other constructors explicitly.
class Dog extends Animal {

	// No arg constructor
	Dog() {
		super("chinnu", 6);
		System.out.println("no arg constructor called from Dog");
	}

	// Parameterized constructor
	Dog(String name, int age) {
		super(name, age);
		System.out.println("Parameterized constructor called  from Dog !");
	}

	public static void main(String[] args) {
		System.out.println("main method started from Dog");

		Dog d = new Dog();// -- Calling default constructor --> calling super()
		System.out.println(d.name);// null
		System.out.println(d.age);// 0

		Dog d1 = new Dog("Chintu bhai", 10);
		System.out.println(d1.name);// Chintu Bhai
		System.out.println(d1.age);// 10
	}
}
