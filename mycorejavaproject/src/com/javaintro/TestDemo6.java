package com.javaintro;

public class TestDemo6 {
	
	static TestDemo6 t1 = new TestDemo6();//long term objects --> Old Gen 

	public static void main(String[] args) {
		
		TestDemo6 t2 = new TestDemo6();//Short term --> Young Gen 

	}

}
