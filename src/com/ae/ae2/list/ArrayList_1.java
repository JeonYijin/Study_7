package com.ae.ae2.list;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList(); //add할 때마다 늘어남, 원래 같은타입만 넣을 수 있는데
										//reference type만 담을 수 있음
										//모든 클래스는 Object type
		String [ ]str = new String[2]; //배열은 크기가 정해져있음
		//같은 데이터타입을 모음
		String s = "First";
		Object e = s;
		
		ar.add("First");
		str[0] = "First";
		System.out.println(ar.size());
		System.out.println(str.length);
		
		ar.add("Second");
		str[1] ="Second";
		System.out.println(ar.size());
		System.out.println(str.length);
		
		
		ar.add("Thrid");
		System.out.println(ar.size());
		//Integer num = 5; //auto boxing
		//Object obj = num;
		Object obj =5;  //위의 두 과정을 한번에 함
		//primitive type은 object 타입이 아님 -> 근데 자동으로 boxing
		ar.add(5);
		
		ar.add('a'); //primitive char를 character로 auto boxing 됨
		ar.add(true); 
		
		System.out.println(ar.get(0));
		System.out.println("=======================");
		ar.add(1,"add");
		ar.set(0, 1);
		ar.remove(0);
		ar.clear();
		System.out.println(ar.size());
		System.out.println(ar.isEmpty());
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		System.out.println("=======================");
		ar.add("first");
		ar.add(2);
		ar.add(3.333);
		ar.add('4');
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		String s0 = (String) ar.get(0);
		int s1 = (Integer)ar.get(1); //reference type -> primitive type auto unboxing 
		
		
		
	}

}
