package com.constructors01;

class vehicle {
	String name = "FZ-S";

}

class Bike extends vehicle {
	String name = "RE";

	void show() {
		System.out.println(super.name);
		System.out.println(this.name);
	}

}

public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		System.out.println("main method started !!");
		Bike b1 = new Bike();
		b1.show();
		System.out.println("main method ended !!");
	}

}
