package com.ae.ae1.wrapper;

import java.util.Scanner;
import java.util.StringTokenizer;

public class WrapperMain2 {

	public static void main(String[] args) {
		//주민번호 스캐너로 입력받기
		//991224-1234567
		//몇 살인지, 어느 계절에 태어났는지 출력 
		// 3-5월 : 봄
		//6~8 : 여름
		//9~11 : 가을
		//12~2 :겨울
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		
		String birthNum = "980228-1234567";
		birthNum = sc.next();
		//입력받은 주민 번호 앞자리 두개 뽑고, 그 다음 두개 뽑기
		

		String s1 = birthNum.substring(0,2);
		//System.out.println(s1);
		String ss = birthNum.substring(7,8);
		//System.out.println(ss);
		if(ss.equals("1") || ss.equals("2") ) {
			s1 = 19+s1;
			System.out.println(s1);
		}else {
			s1 = 20+s1;
		}
		
		int year = Integer.valueOf(s1);
		int age = 2021-year;
		System.out.println("나이는 " + age);
		
		
		String s2 = birthNum.substring(2,4);
		//System.out.println(s2);
		int month = Integer.valueOf(s2);
		System.out.println("태어난 월은 "+ month + "월");
		
		
		if(month >=3 && month<6) {
			System.out.println("봄 출생");
		}else if (month>=6 && month <9) {
			System.out.println("여름 출생");
		}else if(month>=9 && month < 12) {
			System.out.println("가을 출생");
		}else {
			System.out.println("겨울 출생");
		}
		
		
	}

}
