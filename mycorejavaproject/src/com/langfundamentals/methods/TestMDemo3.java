package com.langfundamentals.methods;

//WAP to calculate add sub division multiplication modulus.
//1) No return type + no arguments 
//Arithmetic Operators : + - * / % 
//+ 	-->  Sum of the two numbers 
//- 	-->  Difference of two numbers 
//* 	-->  Product of two numbers 
// '/' 	--> Quotient of two numbers 
// %   	--> Reminder of two numbers 
public class TestMDemo3 {

	void main() {
		System.out.println("main method started !");

//		calling instance methods
		add();
		sub();
		mul();
		div();
		mod();

	}

	void mod() {
		System.out.println("in modulus ");
		double m = 98;
		double n = 5;
		System.out.println("modulus of two numbers:  " + m % n);// 98%5 = 3
	}

	void div() {
		System.out.println("in division ");
		double m = 98;
		double n = 5;
		System.out.println("Division of two numbers:  " + m / n);// 98/5 = 19.x
	}

	void mul() {
		System.out.println("In multiplication ");
		double x = 35.9;
		double y = 56.7;
		System.out.println("Multiplication of two number s: " + x * y);
	}

	void sub() {
		System.out.println("in subtraction !");
		int a = 100;
		int b = 30;
		// The operator - is undefined for the argument type(s) String, int
//		System.out.println("Difference of two numbers : " + a - b);
		System.out.println("Difference of two numbers : " + (a - b));
	}

	void add() {
		System.out.println("in addition !");
		int a = 50;
		int b = 60;
		// String + is working like concatenation
		// Addition -> + is working like a addition
		// BODMAS
		System.out.println("Addition of two numbers : " + (a + b));
	}

}
