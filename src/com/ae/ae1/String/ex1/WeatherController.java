package com.ae.ae1.String.ex1;

import java.util.Scanner;

public class WeatherController {
	private WeatherInfo weatherInfo;
	
	public WeatherController() {
		
		weatherInfo = new WeatherInfo();
		
	}
	
	public void start() {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		weatherInfo.makeWeather();
		
		while(check) {
			System.out.println("1.전체날씨정보");
			System.out.println("2.지역검색정보");
			System.out.println("3.지역정보추가");
			System.out.println("4.종료");
			
			System.out.println("번호를 선택하세요.");
			int num = sc.nextInt();
			
			if(num==1) {
				System.out.println("1");
			}else if(num==2) {
				System.out.println("2");
			}else if(num==3) {
				System.out.println("3");
			}else if(num==4) {
				System.out.println("4");
				break;
			}
		}
		
		
		
		
		System.out.println("Finish");
	}
	
	
	
	
	
	
	
}
