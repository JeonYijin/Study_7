package com.ae.ae1.String.ex1;

import java.util.Scanner;

//날씨 정보를 받아서 조회하는 프로그램 -- 
//날씨 정보는 도시명, 기온, 습도, 상태
//1. 날씨 정보 전체출력
//2. 지역 검색 정보 출력
//3. 지역 정보 추가
//4. 종료

public class WeatherController {
	private WeatherInfo weatherInfo;
	private WeatherView weatherView; //멤버 변수로 선언
	
	public WeatherController() {
		
		weatherInfo = new WeatherInfo();
		weatherView = new WeatherView(); //새로운 객체를 한번만 만들것이기 때문에 한 번 실행되는 생성자 메서드에 작성
	}
	
	public void start() {
		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		WeatherDTO [] weathers = weatherInfo.makeWeather();
		
		while(check) {
			System.out.println("1.전체날씨정보");
			System.out.println("2.지역검색정보");
			System.out.println("3.지역정보추가");
			System.out.println("4.종료");
			
			System.out.println("번호를 선택하세요.");
			int num = sc.nextInt();
			
			if(num==1) {
				this.weatherView.view(weathers);
			}else if(num==2) {
				System.out.println("2");
				WeatherDTO weatherDTO = this.weatherInfo.searchWeather(weathers);
				if(weatherDTO!=null) {
					this.weatherView.view(weatherDTO);
				}else {
					this.weatherView.view("정보가 없다");
				}
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
