package com.ae.ae1.String;

public class StringMain6 {

	public static void main(String[] args) {
		String weather = "서울-대구-대전-광주-부산-제주";
		
		String [] citys = weather.split("-");
		
		for(int i=0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		System.out.println("----------------");
		weather = "32 89 45 67";
		
		citys = weather.split(" ");
		
		for(int i=0; i<citys.length; i++) {
			System.out.println(citys[i]);
		}
		
		System.out.println("----------------");
		String name = "Te st    ";
		name = name.trim();
		name = name.replace(" ", "");
		System.out.println(name.equals("Test"));
		
//		String name = "   Te st       ";
//		name = name.trim();
//		String[] ar = name.split(" ");
//		String name2 = ar[0] +ar[1];
//		System.out.println(name2.equals("Test"));
		
		
		
		
		
	}

}
