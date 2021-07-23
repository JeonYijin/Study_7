package com.ae.ae1.object;

public class Test {
	
	int num1 = 1;
	int num2 = 1;
	@Override
	public boolean equals(Object obj) {
		//멤버변수끼리 같은지 비교
		
		if(obj instanceof Test) {
			return num1 == ((Test)obj).num2;
		}else {
			return false;
		}
		
	}
	
	
	
}
