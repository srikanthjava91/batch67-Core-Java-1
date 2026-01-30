package com.fileio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileDemo4 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		File f1 = new File("C:\\Users\\srknt\\Srikanth Java\\test1\\Hello1.txt");
		FileWriter fw = new FileWriter(f1);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Good day !! ");
		bw.newLine();
		bw.write("All the best !!");
		bw.newLine();
		bw.write(101);
		bw.newLine();
		bw.write(102);

		bw.flush();

		bw.close();
		fw.close();
		System.out.println("main method ended  ");
	}
}
