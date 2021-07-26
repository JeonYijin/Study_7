package com.ae.ae1.object;

public class Test {
	
	int num1 = 1;
	int num2 = 2;
	@Override
	public boolean equals(Object obj) {
		//멤버변수끼리 같은지 비교
		
		boolean result = false;
		
		if(this.num1 == ((Test)obj).num1 && this.num2 == ((Test)obj).num2) { 
			//Test t2 = (Test)obj;로 바꾼 객체 만들어주는 것도 가능
		result = true;	
		}
			return result;
		
		
		
		
		
		
	}
	
	
	
}
