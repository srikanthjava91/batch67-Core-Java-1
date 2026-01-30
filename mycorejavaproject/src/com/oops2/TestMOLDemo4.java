package com.oops2;

public class TestMOLDemo4 {

	void main(String... args) {
		System.out.println("main method started !!");

		addition("");
		addition("", 10);
		addition("", 10, 20);
		addition("", 10, 20, 30);
		addition("", 10, 20, 30, 40);
		addition("", 10, 20, 30, 40, 50);
		addition("", 10, 20, 30, 40, 50, 60);

	}

	// var arg method
	// The variable argument type int of the method addition must be the last
	// parameter
	void addition(String s, int... numbers) {
		int sum = 0;
		for (int n : numbers) {
			sum = sum + n;
		}

		System.out.println("SUm : " + sum);

	}

}
