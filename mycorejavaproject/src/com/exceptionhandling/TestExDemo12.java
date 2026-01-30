package com.exceptionhandling;

import java.io.File;
import java.io.IOException;


//IOException
//throws is the keyword to satisfying the compiler when we have Checked Exception, we can write at method level.
public class TestExDemo12 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Srikanth1.txt");
		f.createNewFile();
		System.out.println("main method ended ");
	}
}
