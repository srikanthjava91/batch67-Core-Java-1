package com.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo3 {
	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");

		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Srikanth2.txt");
		FileWriter fw = new FileWriter(f, true);

		fw.write("Good Morning guys, Have a nice day !!");
		fw.write('A');
		fw.write('\n');
		fw.write('B');
		fw.write('\n');
		fw.write('C');
		fw.write('\n');
		fw.write('D');
		fw.write('\n');
		fw.write(65);
		fw.write('\n');
		fw.write(66);
		fw.flush();

		fw.close();
		System.out.println("main method ended ");

	}

}
