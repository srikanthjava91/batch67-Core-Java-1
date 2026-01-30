package com.langfundamentals;

//Floating Literals 
public class TestLiteralsDemo2 {

	public static void main(String[] args) {
		float f1 = 10;// int --> float
		float f2 = 0123;// oct - int - float
//		float f3 = 10.5;//Type mismatch: cannot convert from double to float
		float f4 = 10.5F;
//		float f5 = 0123.5;//Type mismatch: cannot convert from double to float
		float f6 = 0x123;// Hexa-int -float
//		float f7 = 0x123.5;//invalid : Type mismatch: cannot convert from double to float
//		float f8 = (float)0x123.5;//Invalid hex literal number
		float f9 = 0123.5F;
//		float f10 = 0123.5D;//Type mismatch: cannot convert from double to float

		float f11 = 123F;
		float f12 = 0123F;
//		float f13 = 0x123F;

		System.out.println(f1);// 10.0
		System.out.println(f2);// 83.0
		System.out.println(f4);// 10.5
		System.out.println(f6);
		System.out.println(f9);// 123.5
//		System.out.println(f8);

		System.out.println(f11);// 123.0
		System.out.println(f12);// 123.0
//		System.out.println(f13);// 4671

	}

}
