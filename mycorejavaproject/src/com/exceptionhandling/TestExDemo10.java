package com.exceptionhandling;

public class TestExDemo10 {

	public static void main(String[] args) {
		System.out.println("main method staretd ");

		try {
			System.out.println("in try !");
		}
//		System.out.println();
		catch (Exception e) {
			System.out.println("in catch !");
			e.printStackTrace();
		}
		System.out.println("main method ended ");
	}
}
