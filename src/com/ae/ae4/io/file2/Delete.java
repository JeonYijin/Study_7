package com.ae.ae4.io.file2;

import java.io.File;
import java.nio.file.Path;


public class Delete {
	
	public void deleteFolder() {
		//1. 파일이 있는지 물어보고 파일 제거하기
		//2. 폴더가 있는지 물어보기 -> 있다면 안에 파일이나 폴더가 있는지 물어보기
		//3. 안에 아무것도 없으면 삭제, 있으면 서브 파일과 폴더 먼저 삭제
		//4. 서브 모두 지워서 없으면 해당 폴더 삭제
		//5. test 폴더내에 아무것도 없으면 폴더 삭제
		
		//폴더 지우기 - 폴더에 뭐가 없다 그러면 지우기
		//폴더 파일 구분하기
		//폴더 내에 모든 파일과 폴더들의 이름을 string[]로 리턴받기
		//string[] 안에 있는 이름들을
		File file = new File("c:\\test");

		boolean result = file.exists();
		System.out.println(result);
		
		//test 폴더 내의 파일 죄다 파일리스트로 부르기
		File [] files = file.listFiles();
		//이름 넣기
		String[] names = file.list();
		// 이름 조회해서 파일리스트에 넣고 출력하기
		for(int i=0; i<names.length; i++) {
			File file2 = new File(file, names[i]);
			System.out.println(names[i]);
			System.out.println("-----------");
			
			if(file2.isFile()) {
				file2.delete();
			}
			
			if(file2.isDirectory()) {
				Path path = file2.toPath();
				System.out.println("==========================");
				System.out.println(path);
				
				for(int j=0; j<names.length; j++) {
					File file3 = new File("path");
					file3.delete();
				}
			}
			
			
		}
		
		
			
		
		
	}
	
	
	
	
}
