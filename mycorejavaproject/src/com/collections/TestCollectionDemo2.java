package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo2 {

	public static void main(String[] args) {

		Collection<String> staff = new ArrayList<>();//[]
		staff.add("Sriaknth");
		
		
		Collection<String> girls = new ArrayList<>();
		girls.add("Karthikeyani");
		girls.add("Anusha");
		girls.add("Hima");
		girls.add("Aishwarya");
		girls.add("Dhansri");
		girls.add("Sushmitha");
		girls.add("Manju");

		Collection<String> boys = new ArrayList<>();
		boys.add("Rajesh");
		boys.add("Yaswanth");
		boys.add("Praveen");
		boys.add("Keshava");
		boys.add("Mahesh");
		boys.add("Murari");
		boys.add("Rajendra");

//		System.out.println(boys);
//		System.out.println(girls);
//		
		Collection<String> students = new ArrayList<>();
		students.addAll(boys);
		students.addAll(girls);

//		boys.clear();
		System.out.println(boys);
		System.out.println(students);

		System.out.println(students.contains("Mahesh"));
		System.out.println(students.contains("Srikanth"));

		students.add("Srikanth");
		System.out.println("****************");
		System.out.println(students.containsAll(staff));//[]

	}

}
