package com.ae.ae2.list.ex1;

import java.util.HashMap;

public class MemberSession {
	
	public static final HashMap<String, MemberDTO> SESSION; //클래스 변수 클래스명.변수명
	
	static { //초기화 블럭
		SESSION = new HashMap<String, MemberDTO>();
	}
	
}
