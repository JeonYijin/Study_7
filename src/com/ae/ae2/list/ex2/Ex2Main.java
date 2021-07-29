package com.ae.ae2.list.ex2;

import java.util.ArrayList;

public class Ex2Main {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(1);
		ar.add(2);
		
		MyList mylist = new MyList();
		
		mylist.add(ar, 5);
		mylist.add(ar, 10);
		mylist.remove(ar);
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
	}

}
