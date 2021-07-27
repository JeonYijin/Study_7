package com.ae.ae1.String.ex1;

public class WeatherView {
	
	//정보가 없다는 문자열을 출력하는 메서드 생성
	public void view(String message) {
		System.out.println(message);
	}
	
	

	//WeatherDTO 하나의 정보를 출력하는 메서드 생성
	public void view(WeatherDTO weatherDTO) { //오버로딩하기
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("--------------------------------");
		
		System.out.print(weatherDTO.getCity()+"\t");
		System.out.print(weatherDTO.getGion()+"\t");
		System.out.print(weatherDTO.getHum()+"\t");
		System.out.println(weatherDTO.getCondition());
		System.out.println("--------------------------------");
	}
	
	
	
	
	
	//view
	//모든 지역의 날씨정보를 출력하는 메서드
	//1번을 클릭하면 뷰 메서드 호출하기
	
	public void view(WeatherDTO [] weathers) {
		System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
		System.out.println("--------------------------------");
		for(int i=0; i<weathers.length; i++) {
			System.out.print(weathers[i].getCity()+"\t");
			System.out.print(weathers[i].getGion()+"\t");
			System.out.print(weathers[i].getHum()+"\t");
			System.out.println(weathers[i].getCondition());
			System.out.println("--------------------------------");
		}
	}
	
	
}
