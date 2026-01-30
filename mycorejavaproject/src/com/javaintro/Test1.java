package com.javaintro;

import com.langfundamentals.TestIdentifeirsDemo1;

public strictfp class Test1 extends TestIdentifeirsDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		Test1 t1 = new Test1();
		System.out.println(t1.id_1);
		System.out.println(t1.name$);

		method1();
	}

	static void method1() {
		method2();
		System.out.println("method1 called ");
	}

	static void method2() {
		method3();
		System.out.println("method2 called ");
	}

	static void method3() {
		System.out.println("method3 called ");
		return;
	}
}
