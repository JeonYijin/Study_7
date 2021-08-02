package com.ae.ae4.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FileReader1 {

	public static void main(String[] args) {
		
		File file = new File("c:\\test", "name.txt");
		FileReader fr  = null;
		BufferedReader br = null;
		
		try {
			 fr = new FileReader(file);
			//read() 리턴이 모두 int char타입으로 바꾸어 써야 하는데 문자열을 가져오고 싶을 때
			br = new BufferedReader(fr); //문자열로 만들어주는거
			ArrayList<FileMember> ar = new ArrayList<>();
			
			while(true) {
				String str = br.readLine();
				if(str==null) { //공백은 null 아님 커서 안내려가는 부분이 null
					break;
				}
				FileMember fileMember = new FileMember();
				//파싱 작업
//				StringTokenizer st = new StringTokenizer(str,",");
//					fileMember.setId(st.nextToken());
//					fileMember.setPw(st.nextToken());
//					fileMember.setAge(Integer.parseInt(st.nextToken()));
//					ar.add(fileMember);
				//split 써보기
				String [] sts = str.split(",");
				fileMember.setId(sts[0]);
				fileMember.setPw(sts[1]);
				fileMember.setAge(Integer.parseInt(sts[2]));
				ar.add(fileMember);
				
				//System.out.println(str);
			}
			
			for(int i=0; i<ar.size(); i++) {
				System.out.println("id: "+ar.get(i).getId());
				System.out.println("pw: "+ar.get(i).getPw());
				System.out.println("age: "+ar.get(i).getAge());
				System.out.println("------------");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//자원 해제
			//자원과 연결된 역순으로 해제
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}

}
