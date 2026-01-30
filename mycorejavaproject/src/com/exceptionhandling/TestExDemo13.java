package com.exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

//FileNotFoundException
public class TestExDemo13 {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.out.println("main method strated ");
		try (FileReader fr = new FileReader("C:\\Users\\srknt\\Srikanth Java\\test1\\Srikanth1.txt")) {
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
				Thread.sleep(100);
			}
		}
		System.out.println("main method ended ");
	}

}
