package com.accessmodifiers01;

public strictfp class TestAccessDemo1 {

	static {
		System.out.println("staic block called from TestACcessDemo1 !!");
	}

	{
		System.out.println("instance block called from TestACcessDemo1 !!");
	}

//	TestAccessDemo1() {
//
//	}

//	protected data members 
	protected int a4 = 7;
	protected String name4 = "Dhoni";

	protected void method4() {
		System.out.println("method4 called !");
	}

	// public data members
	public int a3 = 45;
	public String name3 = "Rohit";

	public void method3() {
		System.out.println("method3 called ");
	}

//	default data members 
	int a2 = 18;
	String name2 = "Virat";

	void method2() {
		System.out.println("method2 called ");
	}

//	private data members 
	private int a1 = 10;
	private String name1 = "Sachin";

	private void method1() {
		System.out.println("method1 called !");
	}

//	private TestAccessDemo1(){
//		System.out.println("no arg constructor called ");
//	}

	public static void main(String[] args) {

		System.out.println("main method strated from TestAccessDemo1");

		// Note : We can access private data members within the class.
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.a1);
		System.out.println(t1.name1);
		t1.method1();

		// Note : Accessing the default data members within the class.
		System.out.println(t1.a2);
		System.out.println(t1.name2);
		t1.method2();

		// Note : Accessing the public data members within the class.
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

		// Note : Accessing the protected data members within the class.
		System.out.println(t1.a4);
		System.out.println(t1.name4);
		t1.method4();

	}
}
