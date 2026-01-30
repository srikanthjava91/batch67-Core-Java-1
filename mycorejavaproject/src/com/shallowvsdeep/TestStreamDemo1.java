package com.shallowvsdeep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStreamDemo1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Ram Charan", "Ram NTR", "Rajamouli", "Srikanth", 
				"Vishwa", "Rajinikanth", "Java");
		List<String> updatedList = list.stream()
									   .filter(s -> s.startsWith("R"))
									   .map(s -> s.toUpperCase())
									   .collect(Collectors.toList());
	}
}
