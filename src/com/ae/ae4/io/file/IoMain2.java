package com.ae.ae4.io.file;

import java.util.Calendar;
import java.util.UUID;

public class IoMain2 {

	public static void main(String[] args) {
		
		String fileName ="";
		
		//filename을 생성하는 코드 
		
		fileName = "abc";
		
		//몇번을 돌리든 중복 x 보장
		Calendar calendar = Calendar.getInstance();
		
		long t = calendar.getTimeInMillis();
		
		fileName = String.valueOf("fileName: "+t);
		
		System.out.println(fileName);
		
		
		fileName = UUID.randomUUID().toString();
		
		System.out.println(fileName);
		
		
		
	}

}
