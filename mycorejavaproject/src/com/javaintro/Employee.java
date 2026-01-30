package com.javaintro;

public class Employee {

	{
		System.out.println("Hello instance !");
	}

	@Override
	protected void finalize() {
		System.out.println("finalize method called !!");
	}

	void hello() {
		System.out.println("hello method called ");
		Employee emp1 = new Employee();
	}

	public static void main(String[] args) {
		System.out.println("main method started !!");

		// com.javaintro.Employee@372f7a8d
		Employee e1 = new Employee();

		// com.javaintro.Employee@2f92e0f4
		Employee e2 = new Employee();

		// com.javaintro.Employee@28a418fc
		Employee e3 = new Employee();

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

//		Employee e4 = new Employee();
//
		e1 = null;// Nullifying the object
//		e4 = e2;// Re-assiging the object
//		e3.hello();// Objects created in methods
//		new Employee();// Anonymous Object

		// Runs the garbage collector in the Java Virtual Machine.
//		System.gc();
		System.out.println("**************");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
//		System.out.println(e4);

	}
}
