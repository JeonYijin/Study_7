package com.ae.ae1.String;

public class StringMain7 {

	public static void main(String[] args) {
		int num = 10; //"10"
		
		String n = String.valueOf(num);
		System.out.println(n+1);
		
		String a = "abc";
		String b = "def";
		a= a+b+"gif";
		
		
		
		String n1 = "abc, ";
		String n2 = "def";
		
		StringBuffer sb = new StringBuffer();
		sb.append(n1);
		sb.append(n2);
		sb.append(3);
		
		System.out.println(sb);
		
		String str = sb.toString();
		System.out.println(sb);//sb.toString()
		System.out.println(str);
		
		
		
	}

}
