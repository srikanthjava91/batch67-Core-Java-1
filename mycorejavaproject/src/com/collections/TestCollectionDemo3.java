package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollectionDemo3 {

	public static void main(String[] args) {

		Collection<Float> c1 = new ArrayList<>();

		// The method add(Float) in the type Collection<Float>
//		is not applicable for the arguments (int)
//		c1.add(10);//int --> cannot convert to Float 

		c1.add(5.9F);
		c1.add(5.8F);
		System.out.println(c1);
		System.out.println(c1.hashCode());

		Collection<Float> c2 = new ArrayList<>();
		c2.add(5.9F);
		c2.add(5.8F);
		System.out.println(c2);

		System.out.println(c1.equals(c2));
		System.out.println(c2.hashCode());

		Collection<Float> c3 = new ArrayList<>();

		if (c3.isEmpty()) {
			c3.add(10.5F);
			c3.add(12.5F);
		}

		System.out.println(c3);//[]

	}

}
