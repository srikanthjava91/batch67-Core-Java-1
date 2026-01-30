package com.oops2;

class Person {

	public Person() {
		System.out.println("Person constructor called ");
	}
}

class Ramam {
	Ramam(){
		System.out.println("Ramam constructor called ");
	}
}

class Remo extends Person {
	public Remo() {
		super();
		System.out.println("Remo constructor called ");
	}

}

public class TestInhDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		Remo r = new Remo();
	}
}
