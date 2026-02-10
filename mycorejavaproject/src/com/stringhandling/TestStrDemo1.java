package com.stringhandling;

public class TestStrDemo1 {

	public static void main(String[] args) {

		System.out.println("main method started ");
		TestStrDemo1 t1 = new TestStrDemo1();
		System.out.println(t1);

		String str = "Hello";//SCP : String Constant Pool --> Only object 

		String str1 = "Hello";//SCP : --> 0 Objects 

		String s1 = new String("Java");// One Object in Heap memory + another Object in SCP --> 2 Object
		System.out.println(s1);

		String s2 = new String("Java");// one Object Heap memory --> 1 Object

		System.out.println("main method ended ");

	}

}
