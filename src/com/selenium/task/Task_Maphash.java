package com.selenium.task;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task_Maphash {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map1 = new HashMap<>();
		
		map1.put("JAVA", 1);
		map1.put("ABC", 2);
		map1.put("BYTE", 3);
		map1.put("PYTHON", 6);
		map1.put("RUBY", 9);
		map1.put("C", 2);
		
		Set<String> keySet2 = map1.keySet();
		System.out.println("Random Order \n"  +keySet2);
		
		Map<Integer, String> treemap = new TreeMap(map1);
		
		Set<Integer> keySet = treemap.keySet();
		System.out.println("Ascending Order \n" +keySet);
		

		

	}

}
