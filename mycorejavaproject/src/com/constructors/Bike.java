package com.constructors;

import java.util.Scanner;

public class Bike {

	double price;
	String model;
	String brand;

	Bike(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	Bike(){
		System.out.println("no arg called ");
	}

	void show() {
		System.out.println("Price : " + price);
		System.out.println("Model :" + model);
		System.out.println("brand : " + brand);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
//		Scanner sc = new Scanner();

		Bike b1 = new Bike("Classic", "RE");
		b1.show();

		Bike b2 = new Bike();
		b2.show();

	}

}
