package com.oops2;

//Method over loading Rules  :
//1) Method signature must not to be same.
//2) Method return type no need to be same.()

public class TestMOLDemo2 {

	void main(String[] args) {

		System.out.println("main method started !");
		addition();
		addition('A');
		addition(10);
//		The method addition(int, float) is ambiguous for the type TestMOLDemo2
//		addition(10, 20);

		System.out.println("main method ended !");
	}

	void addition(char c) {
		System.out.println("addition method with one  char args called !" + c);
	}

	void addition() {
		System.out.println("addition method with no args called !");
	}

	void addition(int a) {
		System.out.println("addition method with one  int args called !" + a);
	}

	void addition(float a) {
		System.out.println("addition method with one float args called !" + a);
	}

//	void addition(int a, int b) {
//		System.out.println("addition method with two int args called !" + a + ", " + b);
//	}

	void addition(int a, float b) {
		System.out.println("addition method with ont int, one float args called !" + a + ", " + b);
	}

//	void addition(float a, float b) {
//		System.out.println("addition method with ont float, one float args called !" + a + ", " + b);
//	}

	void addition(float a, int b) {
		System.out.println("addition method with ont float, one int args called !" + a + ", " + b);
	}

}
