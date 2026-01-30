package com.operators;

//Logical Operators : && || !
public class TestOpDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		int a = 10;
		int b = 20;
		int c = 20;

		String name = "Srikanth";
		String name1 = new String("Srikanth");

		System.out.println("&& info ***********");
		System.out.println(true && true);// true
		System.out.println(true && false);// false
		System.out.println(false && true);// false
		System.out.println(false && false);// false

		System.out.println("&& examples ************");
		System.out.println(a != b && name.equals(name1));// true
		System.out.println(a == b && name.equals(name1));// false
		System.out.println(a != b && !name.equals(name1));// false
		System.out.println(a == b && !name.equals(name1));// false

		System.out.println("|| info ");
		System.out.println(true || true);// true
		System.out.println(true || false);// true
		System.out.println(false || true);// true
		System.out.println(false || false);// false

		System.out.println(a != b || name.equals(name1));// true
		System.out.println(a == b || name.equals(name1));// true
		System.out.println(a != b || !name.equals(name1));// true
		System.out.println(a == b || !name.equals(name1));// false

		System.out.println(!(b == c));//false

	}

}
