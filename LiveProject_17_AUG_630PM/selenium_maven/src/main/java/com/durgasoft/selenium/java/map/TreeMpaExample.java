package com.durgasoft.selenium.java.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMpaExample {

	public static void main(String[] args) {
		Map<Integer, Integer> map=new TreeMap<Integer, Integer>();
		map.put(1, 300);
		map.put(3, 100);
		map.put(2, 200);
		map.put(4, 400);
		System.out.println(map);

	}

}
