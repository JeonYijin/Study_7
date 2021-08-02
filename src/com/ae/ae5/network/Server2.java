package com.ae.ae5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		ArrayList<String> lunch = new ArrayList<>(); //점심메뉴 모으기
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("치즈라면");
		lunch.add("샌드위치");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");
		
		ArrayList<String> dinner = new ArrayList<>();
		dinner.add("마라탕");
		dinner.add("죽");
		dinner.add("삼계탕");
		dinner.add("케이크");
		dinner.add("부대찌개");
		
		ServerSocket ss = null; 
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		Random random = null;
		
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("연결 기다리는 중");
			sc = ss.accept();
			System.out.println("연결 성공");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);

			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			boolean check = true;
			while(check) {
				Calendar calendar = Calendar.getInstance();
				random = new Random(calendar.getTimeInMillis());
				String number = br.readLine();
				
				String str = null;
				if(number.equals("1")) {
					int i = random.nextInt(lunch.size()+1);
					str = lunch.get(i);
				}else if(number.equals("2")) {
					int i = random.nextInt(dinner.size()+1);
					str = dinner.get(i);
				}else {
					break;
				}
				
				bw.write(str+"\r\n");
				bw.flush();
				System.out.println("메뉴는 : " + str);
				System.out.println("클라이언트로 전송 성공");
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				
				sc.close();
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//1. 클라이언트 접속 준비
		//2. 접속 성공
		//3. 클라이언트로부터 온 메세지 수신
		// 1이면 점심메뉴 중 하나 전송, 2면 저녁메뉴중 하나 전송 
		//3이면 프로그램 종료
		
		
		
		
		
		
		
	}

}
