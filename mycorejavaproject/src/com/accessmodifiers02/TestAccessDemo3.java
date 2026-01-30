package com.accessmodifiers02;

import com.accessmodifiers01.TestAccessDemo1;

public class TestAccessDemo3 extends TestAccessDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started from TestAccessDemo3");
		
//		System.out.println(10.5/0);//

//		Yes !! We can create Object of classes from outside of the package, 
//		whenever the class is public and after import only.
//		Note : We can import classes whenever the classes are public 
		TestAccessDemo1 t1 = new TestAccessDemo1();
		System.out.println(t1.a3);
		System.out.println(t1.name3);
		t1.method3();

//		 Note : Accessing the protected data members outside of the packages not
//		 possible directly.
//		System.out.println(t1.a4);
//		System.out.println(t1.name4);
//		t1.method4();

		// Yes : We can access protected data outside of the packages of sub classes
		// with sub class object reference only.
		TestAccessDemo3 t3 = new TestAccessDemo3();
		System.out.println(t3.a4);
		System.out.println(t3.name4);
		t3.method4();

//		Whenever the class scope is default, 
//		we cannot create object outside of the packages.
//		TestAccessDemo1 t1 = new TestAccessDemo1();
	}
}
