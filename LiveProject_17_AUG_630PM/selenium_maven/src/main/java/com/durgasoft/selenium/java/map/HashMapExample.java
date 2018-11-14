package com.durgasoft.selenium.java.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101,"Mahesh");
		map.put(100,"Durga");
		map.put(103,"Sunny");
		map.put(102,"Bunny");
		System.out.println(map);
		map.put(103, "Chinny");
		Set<Integer> s = map.keySet();
		System.out.println(s);
		Collection<String> c = map.values();
		System.out.println(c);
		Set<Entry<Integer, String>> s1 = map.entrySet();
		System.out.println(s1);
		
	}

}
