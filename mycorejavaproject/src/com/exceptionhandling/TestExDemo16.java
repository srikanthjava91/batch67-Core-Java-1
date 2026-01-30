package com.exceptionhandling;

//StackOverflowError
//OutOfMemoryError
public class TestExDemo16 {

	{
		System.out.println("instance block ");
//		TestExDemo16 t1 = new TestExDemo16();
	}

	public static void main(String[] args) {
		System.out.println("main method strated ");

		int[] numbers = new int[2147483647];

		TestExDemo16 t1 = new TestExDemo16();

		System.out.println("main method ended ");
	}
}
