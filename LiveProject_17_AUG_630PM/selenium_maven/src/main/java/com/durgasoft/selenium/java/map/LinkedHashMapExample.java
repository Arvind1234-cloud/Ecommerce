package com.durgasoft.selenium.java.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
			Map<Integer, Integer>map=new LinkedHashMap<Integer, Integer>();
			map.put(1, 100);
			map.put(3, 300);
			map.put(2, 200);
			map.put(4, 400);
			System.out.println(map);

	}

}
