package com.ae.ae2.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain1 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("n1", 3);
		map.put("n2", 5);
		
		map.put("n1", 200);
		map.put("n3", 6);
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			int num = map.get(key);
			System.out.println(num);
		}
		
		System.out.println(map);
	}

}
