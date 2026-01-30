package com.exceptionhandling;

public class TestExDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started ");
		try {
			String str = "Srikanth";
			System.out.println(str.charAt(4));// a
			System.out.println(str.charAt(8));
		} catch (StringIndexOutOfBoundsException s) {
//			System.err.println(s.getMessage());
			System.err.println(s.toString());
		}

		System.out.println("main method ended !");
	}
}
