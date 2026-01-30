package com.oops1;

public class TestInhDemo1 implements Cloneable {

	@Override
	protected void finalize() {
		System.out.println("finalize called !");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("main method strated !!");

		TestInhDemo1 t1 = new TestInhDemo1();
		TestInhDemo1 t2 = (TestInhDemo1) t1.clone();
		System.out.println(t1.getClass());// class com.oops1.TestInhDemo1
		System.out.println(t2.hashCode());////498931366
		System.out.println(t2);// 7ad041f3
		System.out.println("***********************");
		int a = 0X1dbd16a6;
		System.out.println();

		System.out.println(a);
		System.out.println(t1);
		System.out.println(t2);

		System.gc();
	}
}
