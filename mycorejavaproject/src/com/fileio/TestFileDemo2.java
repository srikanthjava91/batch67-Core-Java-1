package com.fileio;

import java.io.File;

public class TestFileDemo2 {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\srknt\\Srikanth Java");
		String[] listOfNames = f.list();
		int count = 0;
		for (String name : listOfNames) {
			System.out.println(name);
			count++;
		}
		System.out.println("Count of all Files: " + count);
	}
}
