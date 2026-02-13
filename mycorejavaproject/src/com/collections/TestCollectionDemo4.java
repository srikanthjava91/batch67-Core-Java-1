package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollectionDemo4 {

	public static void main(String[] args) {

		Collection<String> seniors = new ArrayList<>();
		seniors.add("MSD");
		seniors.add("Virat");
		seniors.add("Rohit");
		seniors.add("Sachin");
		seniors.add("Jadeja");
		System.out.println(seniors);

		Collection<String> juniors = new ArrayList<>();

		juniors.add("Hardhik");
		juniors.add("Tilak");
		juniors.add("Abhishek");
		juniors.add("Ishan");
		juniors.add("Sanju");
		juniors.add("Varun");
		juniors.add("Varun");
		juniors.add("Sky");

		juniors.remove("Ishan");
		System.out.println(juniors);

		Collection<String> cricketers = new ArrayList<>();
		cricketers.addAll(juniors);
		cricketers.addAll(seniors);

		cricketers.removeAll(seniors);

//		cricketers.removeIf((s -> s.contains("shek")));
		System.out.println("Cricketers : " + cricketers);

//		 option 1: for each loop or enhanced for loop
//		for(String name:names) {
//			System.out.println(name);
//		}

		// option 2: Universal Cursor : Iterator
//		Iterator<String> itr = names.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			if (itr.next().equals("Varun")) {
//				itr.remove();
//			}
//		}

//		System.out.println(names);

	}

}
