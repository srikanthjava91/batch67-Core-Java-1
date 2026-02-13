package com.arrays;

public class TestDemo20 {

	public static void main(String[] args) {
		Object[] obj = new Object[10];
		obj[0] = 10;
		obj[1] = "sachin";
		obj[2] = 'M';

		for (Object o : obj) {
			System.out.println(o);
		}
	}

}
