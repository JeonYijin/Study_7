package com.ae.ae2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberDAO {
	
	private String info;
	private Scanner sc;
	
	public MemberDAO() {
	
		info = "iu,pw1,32,suzi,pw2,27,choa,pw3,30";
		sc = new Scanner(System.in);
	}
	
	//memberLogin
	//Scanner로 id,pw만 입력받기 MemberDTO 멤버변수로 넣기
	//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘 다 일치하는 것을 찾아서 해당 DTO리턴
	
	public MemberDTO  memberLogin(ArrayList<MemberDTO> ar) {
		MemberDTO member = new MemberDTO();
		System.out.println("id입력");
		member.setId(sc.next());
		System.out.println("pw입력");
		member.setPw(sc.next());
		
		MemberDTO result = null;
		for(int i=0; i<ar.size(); i++) {
			ar.get(i).getId();
			ar.get(i).getPw();
			if(member.getId().equals(ar.get(i).getId()) && member.getPw().equals(ar.get(i).getPw())) {
				result =ar.get(i);
				break;
			}
		}
		return result;
	}
	
	
	
	
	//memberDelete
	//Scanner로 id,pw만 입력받기 MemberDTO 멤버변수로 넣기
	//매개변수로 ArrayList를 받아서 입력받은 id,pw 둘 다 일치하는 것을 찾아서 삭제
	
	public int memberDelete(ArrayList<MemberDTO> ar) {
		MemberDTO member = new MemberDTO();
		System.out.println("삭제할 id를 입력하세요");
		String did = sc.next();
		member.setId(did);
		System.out.println("삭제할 pw를 입력하세요");
		String dpw = sc.next();
		member.setPw(dpw);
		
		int result = 0;
		
		for(int i=0; i<ar.size(); i++) {
			ar.get(i).getId();
			ar.get(i).getPw();
			if(did.equals(ar.get(i).getId()) && dpw.equals(ar.get(i).getPw())) {
				ar.remove(i);
				result = 1;
				break;
			}
		}
		
		return result;
		
	}
	
	
	
	
	//memberAdd
	//scanner로 id, pw, age 입력받아서 MemberDTO 멤버변수로 넣기
	//매개변수로 ArrayList를 받아서 작성한 MemberDTO를 추가하기
	
	public void memberAdd(ArrayList<MemberDTO> ar) {
		MemberDTO member = new MemberDTO();
		
		System.out.println("id를 입력하세요.");
		String id = sc.next();// 나중에 안 쓸 변수는 만들 필요 없음
		member.setId(id);   //합쳐서 member.setId(sc.next());
		System.out.println("pw를 입력하세요.");
		String pw = sc.next();
		member.setPw(pw);
		System.out.println("age를 입력하세요.");
		String age = sc.next(); //합치면 parseInt 안쓰고 nextInt로 받기
		int age2 = Integer.parseInt(age);
		member.setAge(age2);
		
		ar.add(member);
		
	}
	
	

	
		
	//멤버메서드 - memeberInit 
	// info에 있는 정보를 파싱해서 memberDTO 객체 생성해서 대입
	//ArrayList에 각각 추가하고 리턴

	public ArrayList<MemberDTO> memberInit() {
		ArrayList<MemberDTO> ar = new ArrayList<>(); 
		StringTokenizer st = new StringTokenizer(info, ",");
		while(st.hasMoreTokens()) {
			MemberDTO memberDTO = new MemberDTO();
			String id = st.nextToken();
			memberDTO.setId(id);
			
			String pw = st.nextToken();
			memberDTO.setPw(pw);
			
			String age = st.nextToken();
			int age2 = Integer.parseInt(age);
			memberDTO.setAge(age2);
			
			ar.add(memberDTO);   
			//ArrayList에 추가해줌 memberDTO가 돌면서 또 새로운 값을 저장하니까 배열 대신 리스트에 저장
			//System.out.println("-------------------");
		}
		
//		String [] str = info.split(",");
//		for(int i=0; i<str.length; i++) {
//			System.out.println(str[i]);
//		}
//		ArrayList<MemberDTO> mems = new ArrayList<>(); 
//		
//		for(int i=0; i<str.length; i++) {
//			MemberDTO memberDTO = new MemberDTO();
//			memberDTO.setId(str[i]);
//			memberDTO.setPw(str[++i]);
//			memberDTO.setAge(Integer.parseInt(str[++i]));
//			mems.add(memberDTO);

//		}
//		System.out.println(mems.size());
////		for(int i=0; i<mems.size(); i++) {
////			System.out.println(mems.get(i));
////		}
////		
		return ar;
		
	}
	
	
	
	
	
}
