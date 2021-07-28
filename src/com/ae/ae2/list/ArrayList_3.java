package com.ae.ae2.list;

import java.util.ArrayList;

public class ArrayList_3 {

	public static void main(String[] args) {
		
		//Member 타입을 모으려고 하는 리스트 선언
		ArrayList<Member> mem = new ArrayList<Member>();
		
		Member member = new Member();
		member.setId("ae");
		member.setPw("pw");
		mem.add(member);
		
		mem.add(new Member());
		mem.get(1).setId("id"); //멤버를 먼저 넣었으니 주소를 불러서 입력
		
		Member member2 = mem.get(0);
		
	}

}
