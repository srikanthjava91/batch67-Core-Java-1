package com.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestSerializableDemo2 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileInputStream fis = new FileInputStream("C:\\Users\\srknt\\Srikanth Java\\test1\\abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student st = (Student) ois.readObject();

		System.out.println(st.sid);
		System.out.println(st.uname);
		System.out.println(st.password);

	}

}
