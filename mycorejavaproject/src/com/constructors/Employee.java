package com.constructors;

public class Employee {

	int eid;
	String ename;
	double esal;

	// no arg constructor
	Employee() {
		System.out.println("no arg constructor !");
		eid = 101;
		ename = "Unknown";
		esal = 1000.00;
	}

	public Employee(int eid, String ename, double esal) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	// instance method
	void show() {
		System.out.println("**************************");
		System.out.println("Employee ID : " + eid);
		System.out.println("Employee Name : " + ename);
		System.out.println("Employee Salaray : " + esal);
	}

	public static void main(String[] args) {
		System.out.println("main method started !");

		// this below object is created with the help of no arg constructor.
		Employee emp1 = new Employee();
		emp1.show();

		Employee emp2 = new Employee();
		emp2.show();

		Employee emp3 = new Employee();
		emp3.eid = 102;
		emp3.ename = "Srikanth";
		emp3.esal = 100000.00;
		emp3.show();

		Employee emp4 = new Employee(103, "Yash", 200000.00);
		emp4.show();

		Employee emp5 = new Employee(104, "Vishwa", 300000.00);
		emp5.show();

	}
}
