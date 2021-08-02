package com.ae.ae3.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_1 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		while(check) {
			System.out.println("숫자를 입력");

			try {
				int num = sc.nextInt();
				//throw new InputMismatchException();
				//catch()
				int num2 = 20;

				int num3= num2/num;
				
			//예외가 발생하면 예외 객체 생성 후 내려감
//			ArithmeticException ar = new ArithmeticException();
//			catch(ar); --> 원래 쓰이지 않음
//			throw ar; //예외를 던지면 밑에 catch에서 받아주기
				
			System.out.println(num3);
			check = false;
			}catch(ArithmeticException e) {
				//예외가 발생했을 때 실행
				//예외 처리
				System.out.println("예외처리 끝");
			}catch(RuntimeException e) { //오버로딩 개념 catch 여러 개 사용 가능
				System.out.println("숫자만 입력");
				sc.next();
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		
		System.out.println("Finish");
		
		
	}

}
