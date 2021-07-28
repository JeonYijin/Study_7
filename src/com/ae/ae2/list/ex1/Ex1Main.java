package com.ae.ae2.list.ex1;

import java.util.ArrayList;

import com.ae.ae2.list.Member;

public class Ex1Main {

	public static void main(String[] args) {
		
		
		MemberController memberController = new MemberController();
		memberController.start();
		
		
		
		
		
		
		//Object
		//1.클래스명
		//2. 객체
		//reference - 참조 -> class
//		int num =10;
//		Member member = new Member();
//		Object obj = new Object();
		
//		MemberDAO memberDAO = new MemberDAO();
//		ArrayList<MemberDTO> ar = memberDAO.memberInit();
//		memberDAO.memberAdd(ar);
//		
//		int result = memberDAO.memberDelete(ar);
//		
//		if(result>0) {
//			System.out.println("삭제 성공");
//		}else {
//			System.out.println("삭제 실패");
//		}
//		MemberDTO result2 = memberDAO.memberLogin(ar);
//		
//		if(result2 != null) {
//			System.out.println("로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
//		
//		for(int i=0; i<ar.size(); i++) {
//			System.out.println("ID: "+ar.get(i).getId());
//			System.out.println("PW: "+ar.get(i).getPw());
//			System.out.println("AGE: "+ar.get(i).getAge());
//			System.out.println("----------------------------");
//		}
		

	}

}
