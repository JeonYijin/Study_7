package com.ae.ae4.io.file;

import java.io.File;
import java.util.Scanner;

public class FileMain2 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("폴더명을 입력하세요");
		String name = sc.next();
		
		//폴더 이름을 입력했을때 있으면 있다 없으면 없다 출력
		file= new File(file, name);
		
//		if( file.exists()) {
//			System.out.println("있는 폴더");
//		}else {
//			System.out.println("없는 폴더");
//		}

		if(file.exists()) {
			file.delete();
		}else {
			file.mkdirs();
		}
		
		
//		if(!file.exists()) {
//			//file.mkdirs(); 부모폴더 없어도 동시에 생성 가능
//			file.mkdir(); //없는 폴더 밑에 없는 폴더는 불가능 적어도 부모폴더는 있어야 서브 폴더 가능
//		}
		
		
	}

}
