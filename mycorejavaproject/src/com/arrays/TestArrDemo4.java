package com.arrays;

//Q) WAP to to find sum and avg of all the elements from an array..?
public class TestArrDemo4 {

	public static void main(String[] args) {
		double[] marks = { 65, 64.5, 63, 62, 61, 53 };// 0 1 2
		System.out.println(marks);// Address of the object
		System.out.println(marks.length);

		double sum = 0;
		double avg = 0;

//		for (int i = 0; i < marks.length; i++) {
//			sum = sum + marks[i];// 65 129 192 254 315 368
//		}

		for (double m : marks) {
			sum += m;
		}

		avg = sum / marks.length;
		System.out.println("Sum of the total marks : " + sum);// 368
		System.out.println("Avg of all the marks  : " + avg);// 61

	}
}
