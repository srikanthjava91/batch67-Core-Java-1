package com.operators;

//Unary Operators
//+ - ++ --
//pre increment - pre decrement --> ++
//post increment - post decrement --> -- 
//ex: a++ --> a= a+1 
//ex: ++a --> a = a+1 
//ex: a-- --> a= a-1
//ex: --a --> a = a-1

public class TestOpDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started !");
		int a = 5;
		int b = 10;

		System.out.println(+a);// 5
		System.out.println(-b);// -10

		System.out.println(a++);// 5 --> 6
		System.out.println(++a);// 7
		System.out.println(++a);// 8
		System.out.println(--a);// 7
		System.out.println(a--);// 7--> 6
		System.out.println(++a);// 7
		System.out.println(a++);// 7--> 8
		System.out.println(a--);// 8 --> 7
//		

		System.out.println(--b);// 9
		System.out.println(--b);// 8
		System.out.println(b--);// 8 --> 7
		System.out.println(++b);// 8
		System.out.println(++b);// 9
		System.out.println(--b);// 8
		System.out.println(b++);// 8 -->9
		System.out.println(b--);// 9 -->8
		System.out.println(b + 2);// 10

		System.out.println("A value : " + a);// 7
		System.out.println("B value : " + b);// 8

		System.out.println(a++ + b--);// 15 --> 8 --> 7

		System.out.println("A value : " + a);// 8 --> 9
		System.out.println("B value : " + b);// 7

		System.out.println(++a + a++ + --b + b--);// 30 32

		System.out.println("A value : " + a);// 10
		System.out.println("B value : " + b);// 5

		System.out.println(b++ + ++a + ++b + a++);
		
		System.out.println("A value : " + a);// 12
		System.out.println("B value : " + b);// 7
		
		System.out.println(a-- + --a + --b + b--);//34 36 32 30 
		

	}

}
