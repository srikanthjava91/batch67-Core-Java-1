package com.stringhandling;

public class TestStrDemo18 {

	public static void main(String[] args) {

		System.out.println("Mian method started ");

		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1);
		System.out.println(sb1.capacity());// 16

		StringBuffer sb2 = new StringBuffer("Srikanth");
		System.out.println(sb2.capacity());//

		StringBuffer sb3 = new StringBuffer();// 16
		sb3.append("Srikanth");
		System.out.println(sb3.capacity());// 16
		System.out.println("****************************");
		StringBuffer sb4 = new StringBuffer();// 16
		sb4.append("SrikanthSrikanthSrikanthSrikanthSrikanth");// 16*2 + 2= 34 --> 40
		System.out.println(sb4.capacity());

		StringBuffer sb5 = new StringBuffer();// 16
		sb5.append("SrikanthSrikanthSrikanthSrikanthSri");//35
		sb5.append("S");
		sb5.append("SrikanthSrikanthSrikanthSrikanthSrika");
		System.out.println(sb5.capacity());

	}

}
