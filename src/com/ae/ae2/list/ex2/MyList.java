package com.ae.ae2.list.ex2;

import java.util.ArrayList;

public class MyList implements DataIO {

	//DataIO 구현
		//메서드 오버라이딩
		// add 오버라이딩 - add num을 list에 맨 앞에 추가
		// 리스트와 num을 매개로 받는데 가장 앞에 추가
		
	
	@Override
	public void add(ArrayList<Integer> ar, int num) {
		
		ar.add(0,num);
		
	}

	//remove list에서 무조건 마지막 요소를 삭제
	
	
	@Override
	public void remove(ArrayList<Integer> ar) {
		
		ar.remove(ar.size()-1);
		
	}


	
}
//스택구조로 fifo 구현해보기