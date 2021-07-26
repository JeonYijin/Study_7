package com.ae.ae1.String;

public class StringMain2 {

	public static void main(String[] args) {
		
		String name = "hello world";
		
		 char ch = name.charAt(0); //입력한 인덱스에 해당하는 문자를 반환
		System.out.println(ch);
		
		name = "991021-1234567";
		ch = name.charAt(7);
		//남녀 판별
		
		
		if(ch =='1'|| ch =='3') {
			System.out.println("남");
		}else {
			System.out.println("여");
		}
		
		//System.out.println(name.charAt(7));
		ch = name.charAt(200);
		System.out.println(ch);
		
		
	}

}
