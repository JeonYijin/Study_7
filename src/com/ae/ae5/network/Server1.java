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
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		//Server용
		//client 연결 요청이 오면 1:1 socket을 생성해 주는
		//server socket이 있음
		ServerSocket ss = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow =  null;
		BufferedWriter bw = null;
		Scanner scanner = new Scanner(System.in);
		Socket sc = null;
		 
		try {
			 ss = new ServerSocket(8282);
			 System.out.println("Client 접속 기다리는 중");
			 //접속이 되면(요청이 오면) 클라이언트와 연결할 수 있는 소켓을 만들어야 함
			 sc = ss.accept();// 서버소켓과 연결시켜 줌 새로운 소켓을 만드는 것이 아니라
			 System.out.println("Client와 연결 성공");
			 
			 boolean flag = true;
			 while(flag) {
				//byte 읽기
				  is = sc.getInputStream(); // 메세지를 받기 위해 input
				 //문자로 바꾸기
				 ir = new InputStreamReader(is);
				 //문자열로 바꾸기
				 br = new BufferedReader(ir); //여기까지 연결
				 String message = br.readLine(); // br에서 받은 문자열을 읽어오기
				 System.out.println("클라이언트에서 보낸 메세지");
				 System.out.println("client: " + message);
				 if(message.toUpperCase().equals("Q")) {
					 //또는 message.equals("q")|| message.equals("Q")
						break; //flag = false 쓸 때는 continue 함께 사용해서 바로 처음으로 가기
					}

				 System.out.println("클라이언트로 보낼 메세지 입력");
				 message = scanner.nextLine();
				 
				 //반대로 클라이언트한테 메세지 전송하기
				 os = sc.getOutputStream();
				 ow = new OutputStreamWriter(os);
				 bw = new BufferedWriter(ow);
				 
				 bw.write(message+"\r\n");
				 bw.flush();
				 System.out.println("클라이언트로 전송 성공");
				 if(message.toUpperCase().equals("Q")) {
					 
						break; //flag = false 쓸때 마지막 아래에 있기 때문에 continue 쓰든말든
					}
			 }
			 
		} catch (Exception e) {
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
				ss.close();
				scanner.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
