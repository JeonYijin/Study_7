package com.ae.ae2.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain1 {

	public static void main(String[] args) {
		
		HashSet<Integer> hashset = new HashSet<Integer>();
		
		hashset.add(1);
		hashset.add(200);
		hashset.add(1);
		System.out.println(hashset);
		System.out.println(hashset.size());
		
		//전체 출력은 가능
		
		//하나씩 꺼낼 때는 iterator
		Iterator<Integer> it= hashset.iterator();
		
		while(it.hasNext()) {
			Integer num = it.next();
			System.out.println(num);
		}
	}

}
