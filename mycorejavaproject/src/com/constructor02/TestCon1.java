package com.constructor02;

class TestCon1 {

	int a;
	static String name = "Sachin";

	{
		System.out.println("Hello instance ");
	}

	private TestCon1() {
		System.out.println("no arg constructor called !");
	}

	private TestCon1(int a, String name) {
		System.out.println("parameterized constructor called !" + a);
		this.a = a;
		TestCon1.name = name;
	}

	public static void main(String[] args) {
		System.out.println("main method started from Test1!");
		new TestCon1();
		TestCon1 t2 = new TestCon1(10, "Sachin");
		System.out.println(t2.a);
		System.out.println(name);

		TestCon1 t3 = new TestCon1();
		System.out.println(t3.a);
		System.out.println(t3.name);

	}
}
