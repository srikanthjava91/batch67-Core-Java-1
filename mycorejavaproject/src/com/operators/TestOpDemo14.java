package com.operators;

public class TestOpDemo14 {

	public static void main(String[] args) {

		Integer i = 10;
		int i1 = 100;
		System.out.println(i instanceof Integer);
		System.out.println(i instanceof Number);
		System.out.println(i instanceof Object);

		// Incompatible conditional operand types int and Integer
//		System.out.println(i1 instanceof Integer);

		System.out.println("**************");
		String name = "Java";
		System.out.println(name instanceof String);
		System.out.println(name instanceof Object);

		// Incompatible conditional operand types String and Integer
//		System.out.println(name instanceof Integer);

		System.out.println(null instanceof Integer);
		System.out.println(null instanceof String);

	}

}
