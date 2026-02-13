package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo1 {

	public static void main(String[] args) {

//		Collection is a raw type. 
//		References to generic type Collection<E> should be parameterized
		Collection<Integer> c = new ArrayList<>();

		c.add(9);
		c.add(100);
		c.add(200);
		c.add(300);

		System.out.println(c);

	}

}
