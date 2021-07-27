package com.ae.ae1.wrapper;

public class WrapperMain3 {

	public static void main(String[] args) {
		
		String jumin = "981117-1234567";
		//2. 총 합을 11로 나누고 나머지 구하기
		//3. 11 - 나머지 = 검증번호랑 같으면 올바른 번호
		//3.1 11에서 나머지를 빼고 두자리 이상이면 10으로 나누어서 그 나머지 구하기
		// 나머지 숫자랑 검증번호가 같으면 올바른 번호
		

		//1. 번호 쪼개기
		jumin = jumin.replace("-", "");
		//s -> 번호 넣은 배열
		String [] s = new String[jumin.length()];
		for(int i=0; i<jumin.length(); i++) {
			s[i] = jumin.substring(i, i+1);
		}
		
		//2. 쪼갠 번호에 곱하기 2~9
		int num=0;   // 곱한 값들을 더한 값
		int j=2;
		for(int i=0; i<s.length; i++, j++) {
			if(s[i] != s[s.length-1]) {
			num = num + Integer.valueOf(s[i]) * j;
				//2~9까지만 곱하기
				//System.out.println(j); ->j 증가 검증용
				if(j>=9) {
					j = 1;
				}
			}
		}

		System.out.println(num);
		
		//합을 11로 나누고 나머지 구하기, 11에서 나머지 뺀 값이 검증번호랑 같은지 확인
		//checkNum => 나눠서 나온 검증할 번호
		int checkNum =11- (num%11);
		System.out.println(checkNum);
		//realNum => 주민번호의 검증번호 
		int realNum = Integer.valueOf(s[s.length-1]);
		
		if(checkNum>=10) {
			//check2 => checkNum이 10이상일 때 다시 계산해서 검증할 번호
			int check2 = checkNum%10;
			if(check2 == realNum) {
				System.out.println("올바른 번호");
			}else {
				System.out.println("잘못된 번호");
			}
		}else {
			if(checkNum ==realNum) {
				System.out.println("올바른 번호");
			}else {
				System.out.println("잘못된 번호");
			}
		}
		
		
		
		
		
	}

}
