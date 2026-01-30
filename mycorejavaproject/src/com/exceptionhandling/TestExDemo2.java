package com.exceptionhandling;

public class TestExDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated ");

		String str = "Srikanth";
		String s1 = null;
		String s2 = "null";

		try {
			System.out.println("in try");
			System.out.println(str.length());// 8
			System.out.println(s1.length());// NPE
			System.out.println("Hellooooooooooooooooo");
			System.out.println(s2.length());//
		} catch (NullPointerException e) {
			System.out.println("in catch");
//			e.printStackTrace();

//			System.err.println(e.getMessage());
			System.err.println(e.toString());
		}
		System.out.println("main method ended ");
	}
}
