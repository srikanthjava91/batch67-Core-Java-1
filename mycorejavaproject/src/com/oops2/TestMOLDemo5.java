package com.oops2;

public class TestMOLDemo5 {

	void main(String[] args) {

		hello("Srikanth");
		hello("Srikanth", "Vishwa");
		hello("Srikanth", "Vishwa", "Vcube", "Java");

	}

	void hello(String... names) {
		System.out.println("******************");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
