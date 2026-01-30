package com.langfundamentals;

public class TestLiteralsDemo3 {

	static String s5 = null;

	// JavawithSrikanth
	public static void main(String[] args) {

		s5 = "Hello";
		System.out.println(s5);

		String s1 = "Java";// String Literals --> SCP : String Constant Pool //1 object
		String s3 = "Java";// 0 objects

		String s2 = new String("Srikanth");// String Object --> Heap memory// 2 object
		String s4 = new String("Srikanth");// String Object --> Heap memory// 1 object

		System.out.println(s1);
		System.out.println(s3);

		System.out.println(s2);
		System.out.println(s4);

		s1 = "Spring";
		System.out.println(s1);// Spring
		System.out.println(s3);// Java

//		System.out.println(s1 == s3);
//		System.out.println(s2 == s4);

	}

}
