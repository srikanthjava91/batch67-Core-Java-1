package com.fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestFileDemo5 {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("main method strated ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Hello2.txt");
		PrintWriter pw = new PrintWriter(f);

		pw.println("Good morning ");
		pw.println("Good afternoon");
		pw.println("Good evening");
		pw.println(500090);
		pw.println(true);
		pw.println(pw);
		pw.println('A');
		pw.println();

		pw.flush();

	}

}
