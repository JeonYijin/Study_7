package com.ae.ae1.wrapper;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String s = "10";
		System.out.println(10+s); //20 ->이렇게 쓰고 싶을 때
		
		Integer i = new Integer(s);
		
		int num = i.intValue();
		System.out.println(num);
		
		s=" 1";
		s = s.trim();
		num = Integer.parseInt(s);
		System.out.println(num+100);
		
		int n1 = 10;
		Integer n2 = Integer.valueOf(n1); //boxing
		
		Double d = Double.valueOf(3.1);
		
		n1 = n2.intValue(); //unboxing
		
		n2= n1; //자동으로 변경 auto boxing
		
		n1 = n2; //자동으로 변경 auto unboxing
		
		double d1 = d;
		n1 = (int)d1;
		
	}

}
