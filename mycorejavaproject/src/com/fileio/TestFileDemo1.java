package com.fileio;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main methd started !!");
		File f = new File("C:\\Users\\srknt\\Srikanth Java\\test\\Srikanth2.txt");
		f.createNewFile();
		System.out.println(f.isDirectory());
		System.out.println(f.isHidden());
		System.out.println(f.isFile());
		System.out.println("***************************");
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());

		System.out.println(f.getAbsolutePath());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.getCanonicalFile());

		File f1 = new File("C:\\Users\\srknt\\Srikanth Java\\test");
		System.out.println(f1.getFreeSpace());
		System.out.println(f1.getTotalSpace());
		
		System.out.println(f1.isDirectory());
		System.out.println(f1.isHidden());
		System.out.println(f1.isFile());
		System.out.println("***************************");

		if (!f.exists()) {
			boolean isCreated = f.createNewFile();
			if (isCreated) {
				System.out.println("File has been created succesfully !!");
			}
		} else {
			System.out.println("File with this name already available !");
		}

		f.delete();

		System.out.println("main methd ended !!");
	}
}
