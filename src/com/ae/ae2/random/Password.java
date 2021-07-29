package com.ae.ae2.random;

import java.util.ArrayList;
import java.util.Random;

public class Password {
	
	//makePassword
	//랜덤한 패스워드 생성
	//대문자, 소문자, 숫자 조합
	//8글자
	//a4bcD5P0 최종적으로는 문자열 만들기
	//1. 대문자, 소문자, 숫자 결정 //if else 나 switch - random.nextInt(3);
	// 3 미만의 숫자가 나오면  0 - 대문자 1- 소문자 2- 숫자
	//2. 글자 랜덤하게 뽑기 아스키코드 - 문자
	
	public String makePassword() {
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		ArrayList<Object> ar = new ArrayList<>();
		for(int i=0; i<8; i++) {
			int select = random.nextInt(3);
			if(select%3 ==0) {
				System.out.println("대문자");
				int num2 = random.nextInt(26)+65;
				char ch = (char)num2;
				sb.append(ch);
				//ar.add(ch);
				System.out.println(ch);
			}else if(select %3 ==1) {
				System.out.println("소문자");
				int num3 = random.nextInt(26)+97;
				char ch2 = (char)num3;
				sb.append(ch2);
				//ar.add(ch2);
				System.out.println(ch2);
			}else {
				int num = random.nextInt(10);
				sb.append(num);
				//ar.add(num);
				System.out.println(num);
			}
		}
			
		
		
		return sb.toString();
		
	}
	
	
	
	
	
	
	
	
}
