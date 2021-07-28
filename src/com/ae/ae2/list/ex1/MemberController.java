package com.ae.ae2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
		
	private Scanner sc;
	private MemberDAO memberDAO;
	private ArrayList<MemberDTO> ar;
	
	public MemberController() {
		sc = new Scanner(System.in);
		memberDAO = new MemberDAO();
		ar = memberDAO.memberInit();
		
	}
	
	public void start() {
		
		//1. 회원 가입
		//2. 로그인
		//3. 종료
		//초기화 init 
		
		
		boolean check = true;
		while(check) {
			//로그인 성공하면 afterLogin
			
			if(MemberSession.SESSION.containsKey("member")) {
				afterLogin();
			}
			
			
			check = beforeLogin();
			
			
		}

	} //start
	
	private void afterLogin() {
		System.out.println("1. Mypage");
		System.out.println("2. Logout");
		
		
	}
	
	private	boolean beforeLogin() {
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 종료");

		int num = sc.nextInt();
		boolean flag = true;
		if(num==1) {
			memberDAO.memberAdd(ar);
		}else if(num==2) {
			MemberDTO memberDTO = memberDAO.memberLogin(ar);
			if(memberDTO != null) {
				System.out.println("로그인 성공");
				MemberSession.SESSION.put("member", memberDTO); //얘가 들어가서 키를 꺼낼 수 있으면 로그인된 것
			}else {
				System.out.println("로그인 실패");
			}
		}else {
			flag = false;
		}
		return flag;
	}
	
	

}
