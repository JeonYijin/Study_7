package com.ae.ae1.math;

public class MathMain1 {

	public static void main(String[] args) {
		
		
		//0-9 이하 (10미만)의 랜덤한 정수를 출력
		double d =Math.random();
		d = d*10;
		int n = (int)d;
		System.out.println(n);
	}

}
