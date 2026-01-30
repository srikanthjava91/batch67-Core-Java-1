package com.constructors;

public class Customer {
	int cid;
	String cname;
	long phone;
	int age;

	Customer() {
		this(101);// calling one arg constructor into no arg constructor
		System.out.println("no arg constructor called ");

	}

	Customer(int cid) {
		this(cid, "unknown");
		System.out.println("one arg constructor called");
	}

	Customer(int cid, String cname) {
		this(cid, cname, 9000000000L);
		System.out.println("Two arg constructor called");
	}

	Customer(int cid, String cname, long phone) {
		this(cid, cname, phone, 21);
		System.out.println("Three arg constructor called");
	}

	Customer(int cid, String cname, long phone, int age) {
		System.out.println("four arg constructor called");
		this.cid = cid;
		this.cname = cname;
		this.phone = phone;
		this.age = age;

	}

	void show() {
		System.out.println("******************************");
		System.out.println("Customer ID : " + cid);
		System.out.println("Customer Name : " + cname);
		System.out.println("Customer Phone : " + phone);
		System.out.println("Customer Age : " + age);
	}

	public static void main(String[] args) {
		System.out.println("main method started ");
		Customer c1 = new Customer();
		c1.show();

		Customer c2 = new Customer();
		c2.show();

		Customer c3 = new Customer(111);
		c3.show();

		Customer c4 = new Customer(444, "Srikanth");
		c4.show();

		Customer c5 = new Customer(333, "Yash", 9999999999L);
		c5.show();
		
		Customer c6 = new Customer(222, "Ramesh", 9999999999L,22);
		c6.show();

	}
}
