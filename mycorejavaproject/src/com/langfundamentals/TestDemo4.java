package com.langfundamentals;

class Dog {
	String name = "Puppy";

	Dog() {
		System.out.println("no arg");
	}

}

public class TestDemo4 {
	Dog d = new Dog();// this object is created with the help of default constructor created by the
						// Java compiler

	void main() {
		System.out.println("main method started !!");

		TestDemo4 t4 = new TestDemo4();
		System.out.println(t4.d.name);// null

	}

}
