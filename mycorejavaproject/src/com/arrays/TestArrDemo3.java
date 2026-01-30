package com.arrays;

public class TestArrDemo3 {

	public static void main(String[] args) {

		// java.lang.NegativeArraySizeException: -5
//		String[] names = new String[-5];//

		String[] names = new String[5];// 0 1 2 3 4

		names[0] = "Chiranjeevi";
		names[1] = "Tejesh";
		names[2] = "Hari";
		names[3] = "Akram";
//		names[4] = "Yash";

//		for (int i = 0; i < names.length; i++) {
//			System.out.print(names[i] + "   ");//
//		}

		for (String n : names) {
			System.out.println(n);
		}

	}

}
