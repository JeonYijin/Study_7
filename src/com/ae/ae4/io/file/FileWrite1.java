package com.ae.ae4.io.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite1 {

	
	public void Write2() {
		//id, pw, age 스캐너로 받기 
		
		//c->test->member.txt 파일 만들고 입력받은 내용 집어넣기
		// id-pw-age 순으로 저장
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test");
		
		File file2 = new File(file, "member.txt");
		
		System.out.println("id>>");
		String id = sc.next();
		System.out.println("pw>>");
		String pw = sc.next();
		System.out.println("age");
		String age = sc.next();
		
		try {
			FileWriter fw = new FileWriter(file2, true);
			fw.write(id+"-"+pw+"-"+age+"\r\n");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	public void write() {
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\test", "test.txt");
		System.out.println("메세지를 입력하세요");
		String message = sc.nextLine(); //띄어쓰기 포함 다 가져오기 엔터키 만나기 전까지
		
		
		try {
			FileWriter fw = new FileWriter(file, true);
			//boolean이 하는 일
			// true면 기존의 있는 글에 추가 false는 덮어씌우기 안넣으면 기본적으로 false로 생성
			fw.write(message+"\n\r");
			fw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
