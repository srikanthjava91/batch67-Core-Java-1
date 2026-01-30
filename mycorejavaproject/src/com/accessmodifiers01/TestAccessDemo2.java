package com.accessmodifiers01;

public class TestAccessDemo2 {

	public static void main(String[] args) {
		System.out.println("main method strated from TestAccessDemo2");

		TestAccessDemo1 t1 = new TestAccessDemo1();
//		 Note : Accessing the default data members outside of the class within the package is possible.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Note : Accessing the public data members within the class.
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Note : Accessing the protected data members within the package.
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

//		Note : If a constructor is private, we cannot create objects outside of the classes
//		TestAccessDemo1 t1 = new TestAccessDemo1();

//		Note : private data members, we cannot access outside of the classes.
//		System.out.println(t1.a1);//The field TestAccessDemo1.a1 is not visible
//		System.out.println(t1.name1);//The field TestAccessDemo1.name1 is not visible
//		t1.method1();//The method method1() from the type TestAccessDemo1 is not visible

	}

}
