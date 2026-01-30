package com.javaintro;

public class TestDemo3 {

//	native void method3();

	static void method1() {
		System.out.println("hello method1");
		System.out.println("hello method1");
	}

	void method2() {
		System.out.println("hello method2");
	}

	public static void main(String[] args) {
		System.out.println("main method strated !!");
		TestDemo3 a = new TestDemo3();

		// calling the methods
		method1();
		method1();
		method1();
		a.method2();
//		a.method3();
	}

	static {
		System.out.println("hello Vijay ");
	}
}
