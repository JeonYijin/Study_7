package com.ae.ae1.String;

public class StringMain1 {

	public static void main(String[] args) {
		
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		
		
		//String 객체 생성 test
		String t1 = "test"; //객체 생성
		String t2 = new String("test"); //객체 생성
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1.toString());
		System.out.println(t2.toString());
		
		Test test = new Test();
		System.out.println(test);
		System.out.println(test.toString());

		System.out.println(t1==t2);
		
	}


}
