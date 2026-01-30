package com.fileio;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TestFileDemo6 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started !!");
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Hello2.txt");
		try (FileReader fr = new FileReader(f)) {
			int i = fr.read();
			while (i != -1) {
				System.out.print((char) i);
				i = fr.read();
			}
		}
	}
}
