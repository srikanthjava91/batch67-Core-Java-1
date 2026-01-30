package com.operators;

class TestA {

}

class TestB extends TestA {

}

public class TestOPDemo15 {

	public static void main(String[] args) {

		TestA t1 = new TestA();
		TestB t2 = new TestB();

		System.out.println(t1 instanceof TestA);
		System.out.println(t2 instanceof TestB);
		System.out.println(t2 instanceof TestA);

	}

}
