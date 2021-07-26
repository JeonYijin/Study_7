package com.ae.ae1.String;

import java.util.Scanner;

public class StringMain5 {

	public static void main(String[] args) {
		
		String n = "Hello World";
		String n2 = n.replace("W", "HELLO");
		System.out.println(n);
		System.out.println(n2);
		
		String n3 = n.substring(n.indexOf('W'),8); //마지막 인덱스 미만까지
		System.out.println(n3);
		System.out.println("-----------------------");
		
		Scanner sc = new Scanner(System.in);		
		//
		System.out.println("저장할 파일명을 입력");
		//a.txt iu.jpg study.pdf test.iu.gif
		//입력받은 파일명이 이미지 파일인지 아닌지 구분
		//이미지 파일 형식 jpg, gif, png, svg
		String [] files = {"jpg","gif","png","svg"};
		
		String fileName = "iu.gif";
		fileName = sc.next();
		int num = fileName.indexOf(".");
		//num = fileName.lastIndexOf(".");
		String fileName2 = fileName.substring(num+1);
		System.out.println(fileName.substring(num+1));
		
		
		if(fileName2.equals("jpg")|| fileName2.equals("gif")||fileName2.equals("png") ||fileName2.equals("svg")){
			System.out.println("이미지 파일");
		}else {
			System.out.println("이미지 파일이 아님");
		}
		
		boolean check = false;
		
		for(int i=0; i<files.length; i++) {
			if(fileName2.equals(files[i])) {
				check = true;
				break;
			}
		}
		if(check) {
			System.out.println("이미지파일");
		}else {
			System.out.println("이미지 파일 아님");
		}
		
		
		
		
	}

}
