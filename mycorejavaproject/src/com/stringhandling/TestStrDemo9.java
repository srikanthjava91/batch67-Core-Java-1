package com.stringhandling;

//WAP to print String in a reverse order using getBytes & using toCharArray?
public class TestStrDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started!!");

		String str = "Ishan";
		byte[] ab = str.getBytes();// 0 1 2 3 4 5 = 6
		for (int i = ab.length - 1; i >= 0; i--) {
			System.out.print((char) ab[i]);
		}

		System.out.println();
		System.out.println("***********");
		String str1 = "Tilak";
		char[] ach = str1.toCharArray();
		for (int i = ach.length - 1; i >= 0; i--) {
			System.out.print(ach[i]);
		}

		System.out.println();

		int start = 0;
		int end = ach.length - 1;
		int temp = 0;

		while (start < end) {
			temp = ach[start];
			ach[start] = ach[end];
			ach[end] = (char) temp;
			start++;
			end--;
		}

		for (char c : ach) {
			System.out.print(c);
		}

	}

}
