package com.oops2;

import java.io.IOException;

class Test1 {

	static int x = 10;

	void hello(int a) throws Exception{
		x = 100;
		System.out.println("Hello " + a);
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println("main method started from test1 ");
	}

}

class Test2 extends Test1 {
	@Override
	void hello(int a) throws Exception{
		System.out.println("Hello " + a);
	}

	public static void main(String[] args) {
		System.out.println("main method started from test2 ");
	}
}

public class TestDemo1 {

	public static void main(String[] args) {

		Test1 t = new Test1();
//		t.hello(0);

	}

}
