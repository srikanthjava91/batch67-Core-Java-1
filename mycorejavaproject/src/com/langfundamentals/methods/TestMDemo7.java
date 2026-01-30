package com.langfundamentals.methods;

import java.util.Scanner;

public class TestMDemo7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started ");
		TestMDemo7 t = new TestMDemo7();
		double bon = t.getEmployeeBonus();
		double sal = t.getEmployeeSalary();

		System.out.println("Total Salary :" + (bon + sal));
		System.out.println("main method ended ");
	}

	double getEmployeeBonus() {
		System.out.println("Enter your bonus : ");
		double bonus = sc.nextDouble();// 5000
		return bonus;
	}

	double getEmployeeSalary() {
		System.out.println("Enter your salary : ");
		double salary = sc.nextDouble();// 100000
		return salary;
	}

}
