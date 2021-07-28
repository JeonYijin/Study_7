package com.ae.ae2.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		//type이 안전하지 않음
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("hihi");
		//int를 담을 리스트 선언
		ArrayList<Integer> arr = new ArrayList<>(); //뒤에 <>는 생략 가능
		//List는 ArrayList의 super class(Interface)
		//단, generic type도 일치헤야 함
		//List<Integer> list =ar; --> generic이 틀리기 때문에 넣을 수 없음
		
		// List<Object> list = ar; -> 모든 Object가 String은 아니기 때문에 또 타입이 안맞아서 안됨
		
		String s = ar.get(0); //이미 generic에서 string을 받겠다고 했기 때문에 형변환 없이 바로 꺼내 쓸 수 있
		
		
		
		
	}

}
