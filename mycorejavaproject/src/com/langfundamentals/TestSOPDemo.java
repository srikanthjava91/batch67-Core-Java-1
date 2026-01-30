package com.langfundamentals;

public class TestSOPDemo {

//	static String name = "Srikanth";

	/*
	 * void main() { System.out.println("main method with no args "); }
	 */

//	void main(String[] args) {
//		System.out.println("main method with String args ");
//	}

	public strictfp synchronized final static void main(String[] args) {
		System.out.println("main method with String args & public static ");
		for (String arg : args) {
			System.out.println(arg);
		}
	}
}
