package com.stringhandling;

public class TestStrDemo19 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Srikanth");
		sb1.delete(0, 4);// anth or nth
		System.out.println(sb1);
		sb1.deleteCharAt(1);
		System.out.println(sb1);// ath

		StringBuffer sb2 = new StringBuffer();
		sb2.ensureCapacity(100);
		System.out.println(sb2.capacity());//100
		
		System.out.println(sb1.reverse());

	}

}
