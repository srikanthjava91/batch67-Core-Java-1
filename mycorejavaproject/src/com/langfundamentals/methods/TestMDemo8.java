package com.langfundamentals.methods;

import java.util.Scanner;

//WAP to print area of Rectangle, Square, Triangle and Circle..?
//Area of Rectangle : Length * Breadth 
//Area of Square 	: Side * Side 
//Area of Triangle  : 0.5 * base * height
//Area of Circle 	: PI * radius * radius.

//4) with return type  + With arguments 

class Employee{
	int i =10;
}

public class TestMDemo8 {

	int a, b = 10,c;
	
	Employee getEmployee(){
		return new Employee();
	}
	
//	The abstract method hello in type TestMDemo8 can only be defined by an abstract class
//	abstract void hello();

	void main(String[] args) {
		
		Employee e1 = getEmployee();
		System.out.println(e1.i);
		
		System.out.println("main method started ");
		Scanner sc = new Scanner(System.in);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		/* Finding the Area of Circle */
		System.out.println("Enter radius");
		double radius = sc.nextDouble();
		double arCir = areaOfCircle(radius);
		System.out.println("Area of Circle :" + arCir);

		/*
		 * Finding the area of Triangle calling areaOfTriangle method
		 */
		System.out.println("Enter a Base");
		float base = sc.nextFloat();
		System.out.println("Enter a Height");
		double height = sc.nextDouble();
		float arTri = areaOfTriangle(base, height);
		System.out.println("Area of Triangle : " + arTri);

		/*
		 * Finding the area of Rectangle calling areaOfRectangle method
		 */
		System.out.println("Enter a Length : ");
		long length = sc.nextLong();// 10

		System.out.println("Enter a breadth : ");
		long breadth = sc.nextLong();// 5

		double arRec = areaOfRectangle(length, breadth);
		System.out.println("Area of Rectangle : " + arRec);
		/***************/

		System.out.println("main method ended ");
		sc.close();
	}

	double areaOfCircle(double r) {
		return Math.PI * r * r;
	}

	float areaOfTriangle(float b, double h) {
		return (float) (0.5 * b * h);
	}

	double areaOfRectangle(long l, long b) {
		return l * b;
	}

}
