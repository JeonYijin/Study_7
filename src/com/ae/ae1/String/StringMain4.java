package com.ae.ae1.String;

public class StringMain4 {

	public static void main(String[] args) {
		
		String n1 = "iu";  //힙 영역의 상수 구역에 있는 주소를 가짐
		String n2 = "iu";  // 동일하게 힙 영역의 상수 구역에 있는 주소를 가져옴
		String n3 = new String("iu");  //상수 구역이 아닌 힙 영역에 새로운 메모리를 만들어서 저장
		String n4 = new String("iu");
		
		System.out.println(n1==n2); //true
		System.out.println(n3==n4); //false: 
		System.out.println(n1==n3); //false
		System.out.println("---------------------");
		System.out.println(n1.equals(n2));
		System.out.println(n3.equals(n4));
		System.out.println(n1.equals(n3));
		
		
		
	}

}
