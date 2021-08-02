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

public class Client2 {

	public static void main(String[] args) {
		//1. server 접속
		//2 1. 점심메뉴 2. 저녁메뉴 3. 종료 
		//1 누르면 서버에서 메뉴 랜덤으로 보내줌
		//2 누르면 서버에서 메뉴 랜덤으로 보내줌
				
		Socket sc = null;
		Scanner scanner = new Scanner(System.in);
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			sc = new Socket("127.0.0.1", 8282);
			System.out.println("서버 접속 성공");
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			
			boolean check = true;
			while(check) {
				System.out.println("1. 점심메뉴");
				System.out.println("2. 저녁메뉴");
				System.out.println("3. 종료");
				int num = scanner.nextInt();
//				if(num ==1) {
//					bw.write(num+"\r\n");
//					bw.flush();
//					System.out.println("서버로 전송 성공");
//				}else if(num ==2) {
//					bw.write(num+"\r\n");
//					bw.flush();
//					System.out.println("서버로 전송 성공");
//				}else {
//					bw.write(num+"\r\n");
//					bw.flush();
//					System.out.println("서버로 전송 성공");
//					break;
//				}

				bw.write(num+"\r\n");
				bw.flush();
				System.out.println("서버로 전송 성공");
				
				
				if(num>2) {
					break;
				}
				
				String str = br.readLine();
				System.out.println("서버로부터 메뉴 : " +str);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
