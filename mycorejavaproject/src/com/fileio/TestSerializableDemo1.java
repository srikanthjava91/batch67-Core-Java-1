package com.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	private static final long serialVersionUID = 3601817608677566493L;
	int sid = 123;
	String uname = "Sriaknth";
	transient String password = "Javaissimple";

}

public class TestSerializableDemo1 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started ");
		Student s = new Student();
		FileOutputStream fos = new FileOutputStream("C:\\Users\\srknt\\Srikanth Java\\test1\\abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);
	}
}
