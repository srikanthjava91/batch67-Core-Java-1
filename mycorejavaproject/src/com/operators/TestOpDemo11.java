package com.operators;

//6) Bitwise Operators 
//& | ^ ~
public class TestOpDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started ");

		System.out.println("Bitwise & AND*************");
		System.out.println(true & true);// true
		System.out.println(true & false);// false
		System.out.println(false & true);// false
		System.out.println(false & false);// false
		System.out.println("Bitwise & examples*************");
		System.out.println(67 & 27);// 3
		System.out.println(87 & 14);// 6
		System.out.println(96 & 39);// 32
		System.out.println(12 & 9);// 8

		System.out.println("Bitwise | *************");
		System.out.println(true | true);// true
		System.out.println(true | false);// true
		System.out.println(false | true);// true
		System.out.println(false | false);// false

		System.out.println("Bitwise | OR examples*************");
		System.out.println(67 | 27);// 91
		System.out.println(87 | 14);// 95
		System.out.println(96 | 39);// 103
		System.out.println(12 | 9);// 13

		System.out.println("Bitwise ^ *****XOR********");
		System.out.println(true ^ true);// false
		System.out.println(true ^ false);// true
		System.out.println(false ^ true);// true
		System.out.println(false ^ false);// false

		System.out.println(67 ^ 27);// 88
		System.out.println(87 ^ 14);//
		System.out.println(96 ^ 39);//
		System.out.println(12 ^ 9);//

		System.out.println(~67);// -(n+1)

	}

}
