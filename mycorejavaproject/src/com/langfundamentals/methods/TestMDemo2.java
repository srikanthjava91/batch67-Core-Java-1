package com.langfundamentals.methods;

//From Java 25 
//Note : If we want to call instance methods in static area we must need to create object.
public class TestMDemo2 {

	{
		System.out.println("instance block executed !");
	}

//	static show method
	static void show() {
		System.out.println("show method called !");
		TestMDemo2 t2 = new TestMDemo2();
		t2.display();
	}

//	instance display method 
	void display() {
		System.out.println("display method called !");
	}

//	instance main method called by JVM
//	JVM internally creating an object to call this main method.
//	In instance area, we can call instance methods directly
//	and we can call static methods also.
	void main() {
		System.out.println("main method started !");
		display();
		show();
	}

}
