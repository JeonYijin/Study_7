package com.ae.ae5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) {
		//Client용 -> server로
		//ip + port = socket
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw =  null;
		InputStream is =  null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			//서버 접속 전
			sc = new Socket("127.0.0.1", 8282);
			//객체를 만들어서 서버 접속, 객체가 만들어지면 서버 접속이 성공함
			System.out.println("서버와 접속이 성공");
			boolean flag = true;
			while(flag) {
				//서버로 메세지 전송
				System.out.println("서버로 보낼 메세지를 입력"); //next는 엔터키를 기준으로 잘라 보냄
				String message = scanner.nextLine(); // char타입처럼 한글자로 바꿔서 byte로 변경
				//byte 처리
				os = sc.getOutputStream();
				//문자 한글자 처리 (char 타입을 처리)
				ow = new OutputStreamWriter(os);
				//문자열 처리
				bw = new BufferedWriter(ow); //여기까지가 보낼 준비
				bw.write(message+"\r\n"); //실제 보낼 때
				bw.flush();
				System.out.println("서버로 전송 성공");
				//서버에서 보낸 메세지를 받아서 출력
				if(message.toUpperCase().equals("Q")) {
					break;
					//flag = false; continue;
				}
				
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				
				br = new BufferedReader(ir);
				message = br.readLine();
				System.out.println("서버에서 보낸 메세지");
				System.out.println("server: "+ message);
				
				if(message.toUpperCase().equals("Q")) {
					 
						break; //flag = false 쓸때 마지막 아래에 있기 때문에 continue 쓰든말든
					}
				
				
			} //반복문의 끝
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try { //서버도 역순으로 끊어주는 작업 해주기
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				
				sc.close(); //소켓 끊으면 다 끊김 하지만 가끔 exception으로 끊길때가 있음
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
	}

}
