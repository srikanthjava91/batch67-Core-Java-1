package com.oops4;

interface In1 {

	void method1();

	void method2();

	default void method4() {
		System.out.println("Method4 from In1");
	}

}

interface In2 {
	void method2();

	void method3();

	default void method4() {
		System.out.println("Method4 from In2");
	}

}

interface In3 extends In2, In1 {
	@Override
	default void method4() {
		In1.super.method4();
	}

}

class TestIn1 implements In3 {

	@Override
	public void method1() {
		System.out.println("method1 called ");
	}

	@Override
	public void method2() {
		System.out.println("method2 called ");

	}

	@Override
	public void method3() {
		System.out.println("method3 called ");
	}

}

public class TestMultipleInheritanceDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");

		In2 t1 = new TestIn1();
//		t1.method1();
		t1.method2();
		t1.method3();
		t1.method4();

	}

}
