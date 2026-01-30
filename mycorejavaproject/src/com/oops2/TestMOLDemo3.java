package com.oops2;

public class TestMOLDemo3 {

	void main() {
		System.out.println("main method started !!");
		show("Java");
		show(null);
		System.out.println("main method ended !!");
	}

	void show(String s) {
		System.out.println("String method called " + s);
	}

	void show(Object o) {
		System.out.println("Object method called " + o);
	}
}
